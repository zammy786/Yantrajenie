package service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.*;

public class ValidateServiceProvider extends checkSPGrpc.checkSPImplBase{
    @Override
    public void validateSP(CheckSP.checkSPID request, StreamObserver<CheckSP.checkResp> responseObserver) {
//        super.validateSP(request, responseObserver);
        System.out.println("Creating a channel between client and server");
        String spid =request.getSPID();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090).usePlaintext().build();
        SpDetails.commid ServerRequest=SpDetails.commid.newBuilder().setId(spid).build();
        serviceProviderGrpc.serviceProviderBlockingStub userStub =serviceProviderGrpc.newBlockingStub(channel);
        SpDetails.APIResponce ServerResponse=userStub.feedbackValid(ServerRequest);
        CheckSP.checkResp.Builder response=CheckSP.checkResp.newBuilder();
        response.setRespmsg(ServerResponse.getResponceMessage());
        if(ServerResponse.getResponceMessage().equals("Service Provider Exist")){
            response.setRespmsg("success");
        }else{
            response.setRespmsg("failure!");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
