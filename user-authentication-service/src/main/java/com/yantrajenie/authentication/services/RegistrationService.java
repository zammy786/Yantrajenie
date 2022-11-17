package com.yantrajenie.authentication.services;

import com.yantrajenie.authentication.Authentication;
import com.yantrajenie.authentication.authenticationGrpc;
import com.yantrajenie.authentication.utility.GenerateJwt;
import com.yantrajenie.authentication.utility.GenerateOtp;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Supplier;

public class RegistrationService extends authenticationGrpc.authenticationImplBase{

    //use to make the generated token global
    static private String token = "";

    //hashmap to store the otp for forget password
    Map<String,String> forgetOtp = new HashMap<String,String>();
    //use to set the timer for the otp
    private static LocalTime endTime;

    //to check the user exist in database or not using email id(returns true or false)
    public boolean checkReg(String email){
        boolean val = false;
        String query = "select * from registration where email=? ";

        Connection con = null;

        try{
            Class.forName("org.postgresql.Driver");
            con = DatabaseConnection.connect();
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1,email);
            ResultSet resultSet = stmnt.executeQuery();
            if(resultSet.next()){
                System.out.println("User already exist "+resultSet.getString(6));
                val = true;
            }else {
                val = false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return val;
    }



    //adding the new user into the registration table
    public void addReg(String firstName, String lastName, String username, String password, String email, String contactNo, String userType) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encUsername = encoder.encodeToString(username.getBytes());
        String encPassword = encoder.encodeToString(password.getBytes());

        String query = "Insert into registration(first_name,last_name,username,password,email,contact_no,user_type) values (?,?,?,?,?,?,?)";

        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DatabaseConnection.connect();
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1,firstName);
            stmnt.setString(2,lastName);
            stmnt.setString(3,encUsername);
            stmnt.setString(4,encPassword);
            stmnt.setString(5,email);
            stmnt.setString(6,contactNo);
            stmnt.setString(7,userType);
            stmnt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    //getting the user by email id to share it via channel with other services
    public void getUserByEmail(String emailId){

        String query = "Select * from registration where email=?";

        Base64.Decoder decoder = Base64.getDecoder();

        int userId = 0;
        String firstName = "";
        String lastName = "";
        String decUserN = "";
        String decPass = "";
        String email = "";
        String contactNo = "";
        String userType = "";

        Connection connect = null;
        try{
            Class.forName("org.postgresql.Driver");
            connect = DatabaseConnection.connect();
            PreparedStatement stmnt = connect.prepareStatement(query);
            stmnt.setString(1,emailId);
            ResultSet resultSet = stmnt.executeQuery();
            if(resultSet.next()){
                userId = resultSet.getInt(1);
                firstName = resultSet.getString(2);
                lastName = resultSet.getString(3);
                String string = resultSet.getString(4);
                byte[] decode = decoder.decode(string);
                decUserN = new String(decode);
                String string1 = resultSet.getString(5);
                byte[] decode1 = decoder.decode(string1);
                decPass = new String(decode1);
                email = resultSet.getString(6);
                contactNo = resultSet.getString(7);
                userType = resultSet.getString(8);
                System.out.println("Data fetched with userId from the reg table");
            }else{
                System.out.println("No such user");
            }
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        System.out.println("User id: "+userId);
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Username: "+decUserN);
        System.out.println("Password: "+decPass);
        System.out.println("Email: "+email);
        System.out.println("Contact no: "+contactNo);
        System.out.println("User Type: "+userType);
        Channel.sendUserDetials(userId,firstName,lastName,decUserN,decPass,email,contactNo,userType);
    }

    //end point where validation , adding the user into the database table starts and end
    @Override
    public void registration(Authentication.regRequest request, StreamObserver<Authentication.regResponse> responseObserver) {
        System.out.println("Inside the registration method");
        String firstName = request.getFirstName();
        String lastName = request.getLastName();
        String username = request.getUsername();
        String password = request.getPassword();
        String email = request.getEmail();
        String contactNo = request.getContactNo();
        String userType = request.getUserType();

        String message = "Welcome "+firstName+" "+lastName+" to Yantrajenie. Here is your crendentials: Username - "+username+", Password - "+password;


        Authentication.regResponse.Builder response = Authentication.regResponse.newBuilder();
        if(!firstName.equals("") && !lastName.equals("") && !username.equals("") && !password.equals("")
                && !email.equals("") && !contactNo.equals("") && !userType.equals("")){
            if(Validations.validateEmail(email)){
                if(checkReg(email)){
                    System.out.println("User exist");
                    response.setResponseMessage("User Exist");
                    response.setResponseCode(400);
                }else{
                    if(Validations.validateName(firstName) && Validations.validateName(lastName) &&
                            Validations.validateName(username) && Validations.validateContactNo(contactNo)
                            && Validations.validatePassword(password)){
                         addReg(firstName,lastName,username,password,email,contactNo,userType);
                        //sending the user to the user service and sp service
                        getUserByEmail(email);
                        //sending the welcome mail to the user
                        Channel.sendWelcomeMessage(email,message,firstName,lastName);
                        response.setResponseMessage("User added successfully");
                        response.setResponseCode(200);
                        System.out.println("User added successfully");
                    }else {
                        if(Validations.validateName(firstName) == false){
                            response.setResponseMessage("Invalid firstName");
                            response.setResponseCode(300);
                        } else if (Validations.validateName(lastName) == false) {
                            response.setResponseMessage("Invalid lastName");
                            response.setResponseCode(300);
                        } else if (Validations.validateName(username) == false) {
                            response.setResponseMessage("Invalid username");
                            response.setResponseCode(300);
                        } else if (Validations.validateEmail(email) == false) {
                            response.setResponseMessage("Invalid email");
                            response.setResponseCode(300);
                        } else if (Validations.validateContactNo(contactNo) == false) {
                            response.setResponseMessage("Invalid contact no");
                            response.setResponseCode(300);
                        } else if (Validations.validatePassword(password) == false) {
                            response.setResponseMessage("Invalid password");
                            response.setResponseCode(300);
                        }
                    }
                }
            }
        }else {
            response.setResponseMessage("Null value is not accepted");
            response.setResponseCode(404);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    //end point for authentication of the user
    @Override
    public void login(Authentication.loginRequest request, StreamObserver<Authentication.loginResponse> responseObserver) {
        String username = request.getUsername();
        String password = request.getPassword();

        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        String encUsername = encoder.encodeToString(username.getBytes());
        String encPassword = encoder.encodeToString(password.getBytes());

        String query = "select username,password from registration where username=? and password=?";

        Authentication.loginResponse.Builder response = Authentication.loginResponse.newBuilder();
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DatabaseConnection.connect();
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1,encUsername);
            stmnt.setString(2,encPassword);
            ResultSet resultSet = stmnt.executeQuery();
            if(resultSet.next()){
                String token = GenerateJwt.getToken(username);
                System.out.println("token created: "+token);
                response.setResponseMessage("Welcome User: "+username);
                response.setResponseCode(200);
                response.setToken(token);
                String userN = resultSet.getString(1);
                byte[] decode = decoder.decode(userN.getBytes());
                String decUser = new String(decode);
                System.out.println("Welcome user: "+decUser);
            }else {
                response.setResponseMessage("User doesn't exist");
                response.setResponseCode(400);
                System.out.println("User doesn't exist: "+username);
            }
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void forgetPassword(Authentication.forgetPassRequest request, StreamObserver<Authentication.forgetPassResponse> responseObserver) {
        System.out.println("Inside the forger password method");

        String email = request.getEmail();

        String query = "Select email from registration where email=?";


        Authentication.forgetPassResponse.Builder response = Authentication.forgetPassResponse.newBuilder();
        Connection connect = null;
        try {
            if(Validations.validateEmail(email)){
                Class.forName("org.postgresql.Driver");
                connect = DatabaseConnection.connect();
                PreparedStatement stmnt = connect.prepareStatement(query);
                stmnt.setString(1,email);
                ResultSet resultSet = stmnt.executeQuery();
                if(resultSet.next()){
                    String otp = GenerateOtp.getOtp();
                    endTime = LocalTime.now().plusSeconds(30);
                    forgetOtp.put(email,otp);
                    System.out.println("Otp stored at static variable: "+otp);
                    //sending the otp via email to user using the email service
                    Channel.sendOtp(otp,email);
                    System.out.println("Otp generated: "+otp);
                    response.setMessageForget("Otp generated and sent to the registered mail");
                    response.setResponseCode(200);
                }else {
                    response.setMessageForget("Invalid email! Please check your email id");
                    response.setResponseCode(400);
                    System.out.println("Invalid email! Please check your email id");
                }
            }else {
                response.setMessageForget("Invalid email! Please check your email id");
                response.setResponseCode(400);
                System.out.println("Invalid email! Please check your email id");
            }

        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    //will update the password of the user
    @Override
    public void resetPassword(Authentication.resetPassRequest request, StreamObserver<Authentication.resetPassResponse> responseObserver) {
        System.out.println("Inside the reset password method");
        String verifyOtp = request.getOtp();
        String newPass = request.getPassword();
        Base64.Encoder encoder = Base64.getEncoder();
        String encPassword = encoder.encodeToString(newPass.getBytes());
        System.out.println("Encoded password: "+encPassword);

        String email = "";

        Set<String> strings = forgetOtp.keySet();
        for(String s:strings){
            if(forgetOtp.get(s).equals(verifyOtp)){
                email = s;
                break;
            }
        }

        String query = "Update registration set password = ? where email =?";

        Authentication.resetPassResponse.Builder response = Authentication.resetPassResponse.newBuilder();

        //deserialize the token and get the otp
        //in if statement token.getexpiration() will return expiration value
        if(LocalTime.now().isBefore(endTime)){
            if(verifyOtp.equals(forgetOtp.get(email))){
                Connection connect = null;
                try {
                    Class.forName("org.postgresql.Driver");
                    //to update the table registration with the new password
                    connect = DatabaseConnection.connect();
                    PreparedStatement stmnt = connect.prepareStatement(query);
                    stmnt.setString(1,encPassword);
                    stmnt.setString(2,email);
                    stmnt.executeUpdate();
                    System.out.println("Password updated successfully");
                    //otp = "";
                    System.out.println("After otp is used: "+forgetOtp.get(email));
                    forgetOtp.remove(email);
                    response.setMessageReset("Password updated successfully");
                    response.setResponseCode(200);
                }catch (SQLException e){
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        connect.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }else {
                System.out.println("Invalid otp! Enter the correct otp");
                response.setMessageReset("Invalid otp! Enter the correct otp");
                response.setResponseCode(400);
            }
        }else{
            System.out.println("Otp expired! Generate a new otp");
            response.setMessageReset("Otp expired! Generate a new otp");
            response.setResponseCode(400);
        }


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}

