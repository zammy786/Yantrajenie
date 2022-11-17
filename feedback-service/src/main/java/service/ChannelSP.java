package service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.SpDetails;
import org.example.serviceProviderGrpc;

public class ChannelSP {
    public static boolean validateUser(String sp_id){
        boolean val=false;
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8090).usePlaintext().build();
        SpDetails.commid request=SpDetails.commid.newBuilder().setId(sp_id).build();
        serviceProviderGrpc.serviceProviderBlockingStub usStub = serviceProviderGrpc.newBlockingStub(channel);
        SpDetails.APIResponce response=usStub.feedbackValid(request);
        String respMsg = response.getResponceMessage();
        if(response.getResponceMessage().equals("Service Provider Exist")){
            val=true;
        }
        else{
            val=false;
        }
        return val;
    }
}
