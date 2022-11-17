package service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.CheckUser;
import org.example.UserService;
import org.example.checkUserGrpc;
import org.example.userServiceGrpc;

public class ValidateUser extends checkUserGrpc.checkUserImplBase{
    @Override
    public void validateUser(CheckUser.checkuid request, StreamObserver<CheckUser.checkResp> responseObserver) {
        System.out.println("Creating a channel between client and server");
        int uid = request.getUserId();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
        UserService.validate ServerRequest=UserService.validate.newBuilder().setUserId(uid).build();
        userServiceGrpc.userServiceBlockingStub userStub =userServiceGrpc.newBlockingStub(channel);
        UserService.Response6 ServerResponse=userStub.usvalidate(ServerRequest);
        CheckUser.checkResp.Builder response=CheckUser.checkResp.newBuilder();
        response.setRespmsg(ServerResponse.getResMsg());
        if(ServerResponse.getResMsg().equals("User Exists")){
            response.setRespmsg("success");
        }else{
            response.setRespmsg("failure!");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    }

