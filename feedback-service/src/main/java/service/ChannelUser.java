package service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.UserService;
import org.example.userServiceGrpc;

public class ChannelUser {
    public static boolean validateUser(String user_id){
        boolean val=false;
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();
        UserService.validate request=UserService.validate.newBuilder().setUserId(Integer.parseInt(user_id)).build();
        userServiceGrpc.userServiceBlockingStub usStub = userServiceGrpc.newBlockingStub(channel);
        UserService.Response6 response=usStub.usvalidate(request);
        String respMsg = response.getResMsg();
        if(response.getResMsg().equals("User Exists")){
            val=true;
        }
        else{
            val=false;
        }
        return val;
    }
}
