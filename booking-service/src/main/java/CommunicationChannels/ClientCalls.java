package CommunicationChannels;

import com.yantragenie.email.Email;
import com.yantragenie.email.email1Grpc;
import com.yantragenie.spdetail.SpDetails;
import com.yantragenie.spdetail.serviceProviderGrpc;
import com.yantragenie.status.Status;
import com.yantragenie.status.bookingStatusGrpc;
import com.yantragenie.userdetail.UserService;
import com.yantragenie.userdetail.userServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientCalls {
    private final int spDetailPort=8090;
    private final String spDetailUrl = "localhost";

    private final int userPort = 8085;
    private final String userUrl ="localhost";

    private final String statusUrl = "localhost";
    private final int statusport = 7001;

    //client call to spdetail service
    public SpDetails.ProfileDetails getSpDetails(String id) throws Exception{
        ManagedChannel channel = ManagedChannelBuilder.forAddress(spDetailUrl,spDetailPort).usePlaintext().build();
        SpDetails.commid idForDetail = SpDetails.commid.newBuilder().setId(id).build();
        serviceProviderGrpc.serviceProviderBlockingStub stub = serviceProviderGrpc.newBlockingStub(channel);

        SpDetails.ProfileDetails profileDetails = stub.spGetProfileDetailsUsingId(idForDetail);
        channel.shutdown();
        return profileDetails;
    }


    //client call to user service
    public UserService.Response2 getUserDetails(String id) throws Exception{
        ManagedChannel channel = ManagedChannelBuilder.forAddress(userUrl,userPort).usePlaintext().build();
        UserService.userdetails detail = UserService.userdetails.newBuilder().setUserId(Integer.parseInt(id)).build();
        userServiceGrpc.userServiceBlockingStub stub = userServiceGrpc.newBlockingStub(channel);

        UserService.Response2 userDetails = stub.usdetails(detail);
        channel.shutdown();
        return userDetails;


    }

    //client call to status service

    //insert booking in status service
    public void insertBooking(String id,String email) throws Exception{
        ManagedChannel channel = ManagedChannelBuilder.forAddress(statusUrl,statusport).usePlaintext().build();
        Status.Request request = Status.Request.newBuilder().setId(id).setEmail(email).build();

        bookingStatusGrpc.bookingStatusBlockingStub stub = bookingStatusGrpc.newBlockingStub(channel);

        stub.insertNewBooking(request);
        channel.shutdown();

    }

    public String getBookingStauts(String id) throws Exception{

        ManagedChannel channel = ManagedChannelBuilder.forAddress(statusUrl,statusport).usePlaintext().build();
        Status.Request request = Status.Request.newBuilder().setId(id).build();

        bookingStatusGrpc.bookingStatusBlockingStub stub = bookingStatusGrpc.newBlockingStub(channel);
       String status = stub.showStatus(request).getBookingStatus();
       channel.shutdown();
       return status;


    }

    public String getTicketStatus(String id) throws Exception{

        ManagedChannel channel = ManagedChannelBuilder.forAddress(statusUrl,statusport).usePlaintext().build();
        Status.Request request = Status.Request.newBuilder().setId(id).build();

        bookingStatusGrpc.bookingStatusBlockingStub stub = bookingStatusGrpc.newBlockingStub(channel);
        String status = stub.showStatus(request).getTicketStatus();
        channel.shutdown();
        return status;


    }

    public void updateBookingStatus(String id,String status) throws Exception{
        ManagedChannel channel = ManagedChannelBuilder.forAddress(statusUrl,statusport).usePlaintext().build();
        Status.UpdateRequest payload = Status.UpdateRequest.newBuilder().setId(id).setStatus(status).build();

        bookingStatusGrpc.bookingStatusBlockingStub stub = bookingStatusGrpc.newBlockingStub(channel);
        stub.updateBookingStatus(payload);
        channel.shutdown();
    }






    public void updateTicketStatus(String id,String status) throws Exception{
        ManagedChannel channel = ManagedChannelBuilder.forAddress(statusUrl,statusport).usePlaintext().build();
        Status.UpdateRequest payload = Status.UpdateRequest.newBuilder().setId(id).setStatus(status).build();

        bookingStatusGrpc.bookingStatusBlockingStub stub = bookingStatusGrpc.newBlockingStub(channel);
        stub.updateTicketStatus(payload);
        channel.shutdown();

    }

    //client call to email service
    public void sendEmail(String email,String content){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8082).usePlaintext().build();
        Email.requestEmailId payload = Email.requestEmailId.newBuilder().setEmail(email).setMessage1(content).build();
        email1Grpc.email1BlockingStub stub = email1Grpc.newBlockingStub(channel);
        stub.sendEmail(payload);
        return;

    }





}
