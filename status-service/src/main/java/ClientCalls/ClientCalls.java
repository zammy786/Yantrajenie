package ClientCalls;


import generated.Email;
import generated.email1Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientCalls {


    public void sendEmail(String email,String content){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8082).usePlaintext().build();
        Email.requestEmailId payload = Email.requestEmailId.newBuilder().setEmail(email).setMessage1(content).build();
        email1Grpc.email1BlockingStub stub = email1Grpc.newBlockingStub(channel);
         stub.sendEmail(payload);

    }





}
