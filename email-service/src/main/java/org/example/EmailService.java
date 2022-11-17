package org.example;

import io.grpc.stub.StreamObserver;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.*;
import java.util.Properties;

import static java.lang.Integer.parseInt;
import static javax.xml.bind.DatatypeConverter.parseString;

public class EmailService extends email1Grpc.email1ImplBase {

    //to send the welcome mail to the user who is registering for the first time in the portal
    @Override
    public void sendEmail(Email.requestEmailId request, StreamObserver<Email.emailResponse> responseObserver) {
        System.out.println("Inside the send email method");

        String email = request.getEmail();
        String message1 = request.getMessage1();
     
         System.out.println("Email "+email);
         System.out.println("Message "+message1);
      
         Email.emailResponse.Builder response = Email.emailResponse.newBuilder();

        Session session = null;
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        session = Session.getInstance(properties, new javax.mail.Authenticator()
        {

            protected PasswordAuthentication getPasswordAuthentication()
            {

                return new PasswordAuthentication("yantrajenie@gmail.com", "fqbkvsireedsgjtd");

            }

        });
        session.setDebug(true);
        MimeMessage message = new MimeMessage(session);
        try
        {
            message.setFrom(new InternetAddress(email));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(request.getEmail()));
            message.setSubject("Welcome to yantrajenie");
            message.setText(message1);
            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
            response.setResponseMessage("Welcome mail sent successfully");
            response.setResponseCode(200);
        }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    public boolean validateEmail(String email )
    {
        try
        {
            if(email.matches("^[a-z0-9.]+@[A-Za-z0-9-]+[.][A-Za-z]{2,}$"))
                return true;
            else
                throw new InvalidEmailException("Invalid Email");
        }catch (InvalidEmailException e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public void sendingOTP(Email.sendOTP request, StreamObserver<Email.emailResponse> responseObserver) {
        int otp = request.getOTP();
        String email = request.getEmail();
        Email.emailResponse.Builder response = Email.emailResponse.newBuilder();

        Session session = null;
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        session = Session.getInstance(properties, new javax.mail.Authenticator()
        {

            protected PasswordAuthentication getPasswordAuthentication()
            {

                return new PasswordAuthentication("yantrajenie@gmail.com", "fqbkvsireedsgjtd");

            }

        });
        session.setDebug(true);
        MimeMessage message = new MimeMessage(session);
        try
        {
            message.setFrom(new InternetAddress(email));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(request.getEmail()));
            message.setSubject("YOUR OTP GENERATED");
            message.setText("your otp is "+ otp +" for verification");
            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
            response.setResponseMessage(" OTP SENT ");
            response.setResponseCode(200);

        }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }
}





