package com.yantrajenie.authentication.services;

import com.yantrajenie.authentication.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class Channel {//all the channels to connect with other services are here in this class

    //Channel created to send the user details to other services like userservice and serviceproviderservice
    public static void sendUserDetials(int userId,String firstName,String lastName,String decUserN,String decPass,String email,String contactNo,String userType) {
        //for shubham userdetails service
        ManagedChannel channelUser = ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();

        //for ishu spdetails service
        ManagedChannel channelSp = ManagedChannelBuilder.forAddress("localhost",8090).usePlaintext().build();

        if(userType.equals("USER")){
            UserService.adduser userReq = UserService.adduser.newBuilder().setUserId(userId).setFirstName(firstName).setLastName(lastName).setUsername(decUserN).setPassword(decPass).setEmail(email).setContactNo(contactNo).build();
            userServiceGrpc.userServiceBlockingStub userStub = userServiceGrpc.newBlockingStub(channelUser);
            UserService.Response1 userResponse = userStub.addUser(userReq);

            System.out.println("User response: "+userResponse.getResMsg());
            System.out.println("User response: "+userResponse.getResCode());
        } else if (userType.equals("SERVICE PROVIDER")) {
            SpDetails.spProfileData spReq = SpDetails.spProfileData.newBuilder().setId(String.valueOf(userId)).setFirstName(firstName).setLastName(lastName).setUserName(decUserN).setPassword(decPass).setEmail(email).setMobileNumber(contactNo).build();
            serviceProviderGrpc.serviceProviderBlockingStub spStub = serviceProviderGrpc.newBlockingStub(channelSp);
            SpDetails.APIResponce spResponse = spStub.spCreateProfile(spReq);

            //receiving the output from the server of different services
            System.out.println("Sp response: "+spResponse.getResponceMessage());
            System.out.println("Sp response: "+spResponse.getResponceCode());
        }
    }

    //to connect with the email service to send the otp
    public static void sendOtp(String otp, String email) {
        System.out.println("Inside the send otp method");
        //to connect with the email service
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8082).usePlaintext().build();
        //input to the end point of the email service to send the otp
        Email.sendOTP emailReq = Email.sendOTP.newBuilder().setOTP(Integer.parseInt(otp)).setEmail(email).build();
        //stub of the email service with which channel is connected
        email1Grpc.email1BlockingStub emailStub = email1Grpc.newBlockingStub(channel);
        //getting the response from the email service
        Email.emailResponse emailResp = emailStub.sendingOTP(emailReq);

        //receiving the output from the server of different services
        System.out.println("Response message: "+emailResp.getResponseMessage());
        System.out.println("Response code: "+emailResp.getResponseCode());

    }

    //to send the welcome email to the registered user
    public static void sendWelcomeMessage(String email, String message,String firstname, String lastname){
        System.out.println("Inside the send welcome method");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8082).usePlaintext().build();

        Email.requestEmailId sendEmail = Email.requestEmailId.newBuilder().setEmail(email).setMessage1(message).setFirstName(firstname).setLastName(lastname).build();
        email1Grpc.email1BlockingStub emailStub = email1Grpc.newBlockingStub(channel);

        Email.emailResponse emailRes = emailStub.sendEmail(sendEmail);

        //receiving the output from the server of different services
        System.out.println("Response Message: "+emailRes.getResponseMessage());
        System.out.println("Response code: "+emailRes.getResponseCode());
    }
}
