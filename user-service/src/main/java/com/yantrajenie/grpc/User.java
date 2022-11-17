package com.yantrajenie.grpc;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.yantrajenie.grpc.Services.Database;
import io.grpc.stub.StreamObserver;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.Base64;

public class User extends userServiceGrpc.userServiceImplBase {

    //user will be added from registration
    @Override
    public void addUser(UserService.adduser request, StreamObserver<UserService.Response1> responseObserver) {
        int userId = request.getUserId();
        String first_name = request.getFirstName();
        String last_name = request.getLastName();
        String username = request.getUsername();
        String password = request.getPassword();
        String email = request.getEmail();
        String contactNo = request.getContactNo();
        UserService.Response1.Builder response1 = UserService.Response1.newBuilder();
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = Database.connect();
            System.out.println("Connection established");
            String query = "insert into userdetails values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);
            stmt.setString(2, first_name);
            stmt.setString(3, last_name);
            stmt.setString(4, username);
            stmt.setString(5, password);
            stmt.setString(6, email);
            stmt.setString(7, contactNo);
            int i = stmt.executeUpdate();
            if (i == 1) {
                response1.setResMsg("User Added Successfully");
                response1.setResCode("200");
            } else {
                response1.setResMsg("Invalid user");
                response1.setResCode("400");
            }
            System.out.println("User Added Successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onNext(response1.build());
        responseObserver.onCompleted();

    }

    //to chech user is valid or not
    @Override
    public void usvalidate(UserService.validate request, StreamObserver<UserService.Response6> responseObserver) {
        System.out.println("Checking Valid User....");
        int userId = request.getUserId();
        UserService.Response6.Builder response6 = UserService.Response6.newBuilder();
        Connection conn = null;
        if (userId > 0) {
            try {
                Class.forName("org.postgresql.Driver");
                conn = Database.connect();
                System.out.println("Connection established");
                String query = "select * from userdetails where user_id = ?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setInt(1, userId);
                ResultSet resultSet = stmt.executeQuery();
                if (resultSet.next()) {
                    response6.setResMsg("User Exists");
                } else {
                    response6.setResMsg("User does not exist");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        } else {
            response6.setResMsg("Invalid User Id... Please Enter Valid User Id");
        }
        responseObserver.onNext(response6.build());
        responseObserver.onCompleted();
    }

    //getting details using user id from the user_details table
    @Override
    public void usdetails(UserService.userdetails request, StreamObserver<UserService.Response2> responseObserver) {
        System.out.println("Inside the us details method");
        int user_id = request.getUserId();
        String firstName = "";
        String lastName = "";
        String username = "";
        String password = "";
        String email = "";
        String contactNo = "";
        String flatNo = "";
        String streetName = "";
        String landMark = "";
        String city = "";
        String state = "";
        String pinCode = "";

        String query1 = "select * from userdetails where user_id = ?";
        String query2 = "select * from useraddress where user_id = ?";
        UserService.Response2.Builder response = UserService.Response2.newBuilder();
        Connection connection = null;
        try {
            connection = Database.connect();
            PreparedStatement stmnt1 = connection.prepareStatement(query1);
            PreparedStatement stmnt2 = connection.prepareStatement(query2);
            stmnt1.setInt(1, user_id);
            stmnt2.setInt(1, user_id);
            ResultSet resultSet = stmnt1.executeQuery();
            if (resultSet.next()) {
                user_id = resultSet.getInt(1);
                firstName = resultSet.getString(2);
                lastName = resultSet.getString(3);
                username = resultSet.getString(4);
                password = resultSet.getString(5);
                email = resultSet.getString(6);
                contactNo = resultSet.getString(7);
            } else {
                response.setResCode("400 - User Not Exist");
                System.out.println("User Does Not Exist");
            }
            ResultSet resultSet1 = stmnt2.executeQuery();
            if (resultSet1.next()) {
                flatNo = resultSet1.getString(2);
                streetName = resultSet1.getString(3);
                landMark = resultSet1.getString(4);
                city = resultSet1.getString(5);
                state = resultSet1.getString(6);
                pinCode = resultSet1.getString(7);
            } else {
                response.setResCode("400 - User Not Exist");
                System.out.println("User Does Not Exist");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        response.setUserId(user_id);
        response.setFirstName(firstName);
        response.setLastName(lastName);
        response.setUsername(username);
        response.setPassword(password);
        response.setEmail(email);
        response.setContactNo(contactNo);
        response.setFlatNo(flatNo);
        response.setStreetName(streetName);
        response.setLandMark(landMark);
        response.setCity(city);
        response.setState(state);
        response.setPinCode(pinCode);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    //user address details by user_id
    @Override
    public void usaddress(UserService.address request, StreamObserver<UserService.Response3> responseObserver) {
        int userId = request.getUserId();
        String flatNo = request.getFlatNo();
        String streetName = request.getStreetName();
        String landMark = request.getLandMark();
        String city = request.getCity();
        String state = request.getState();
        int pinCode = request.getPinCode();
        UserService.Response3.Builder response3 = UserService.Response3.newBuilder();
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = Database.connect();
            System.out.println("Connection established");
            String query = "insert into useraddress values (?,?,?,?,?,?,?)";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setInt(1, userId);
            stmnt.setString(2, flatNo);
            stmnt.setString(3, streetName);
            stmnt.setString(4, landMark);
            stmnt.setString(5, city);
            stmnt.setString(6, state);
            stmnt.setInt(7, pinCode);
            int i = stmnt.executeUpdate();
            if (i == 1) {
                response3.setResMsg("Address Added Successfully");
                response3.setResCode("200");
            } else {
                response3.setResMsg("Invalid...Try Again");
                response3.setResCode("400");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onNext(response3.build());
        responseObserver.onCompleted();

    }


    //to update user details by user_id
    @Override
    public void usupdate(UserService.update request, StreamObserver<UserService.Response4> responseObserver) {
        System.out.println("Inside user services update ");
        int userId = request.getUserId();
        String contactNo = request.getContactNo();
        String flatNo = request.getFlatNo();
        String streetName = request.getStreetName();
        String landMark = request.getLandMark();
        String city = request.getCity();
        String state = request.getState();
        int pinCode = request.getPinCode();
        UserService.Response4.Builder response4 = UserService.Response4.newBuilder();

         //query to update contact_no by user_id

        String query1 = "update userdetails set contact_no=? where user_id =?;";

        //query to update user address by user_id
        String query2 = "update useraddress set flatno=?,streetname=?,landmark=?,city=?," +
                "state= ?,pincode=? where user_id =?;";

        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = Database.connect();
            System.out.println("Connection Established");
            PreparedStatement stmnt1 = con.prepareStatement(query1);
            PreparedStatement stmnt2 = con.prepareStatement(query2);
            stmnt1.setString(1, contactNo);
            stmnt1.setInt(2, userId);
            int i1 = stmnt1.executeUpdate();
            if (i1 == 1) {
                response4.setResMsg("User Contact No updated");
                response4.setResCode("200");
            } else {
                response4.setResMsg("Invalid User Id");
                response4.setResCode("400");
            }
            stmnt2.setString(1, flatNo);
            stmnt2.setString(2, streetName);
            stmnt2.setString(3, landMark);
            stmnt2.setString(4, city);
            stmnt2.setString(5, state);
            stmnt2.setInt(6, pinCode);
            stmnt2.setInt(7, userId);
            int i2 = stmnt2.executeUpdate();
            if (i2 == 1) {
                response4.setResMsg("User Address updated");
                response4.setResCode("200");
            } else {
                response4.setResMsg("Invalid User Id");
                response4.setResCode("400");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onNext(response4.build());
        responseObserver.onCompleted();

    }

    //delete user by user id
    @Override
    public void usdelete(UserService.deluser request, StreamObserver<UserService.Response5> responseObserver) {
        int userId = request.getUserId();
        UserService.Response5.Builder response5 = UserService.Response5.newBuilder();
        if (userId != 0) {
            Connection con = null;
            try {
                Class.forName("org.postgresql.Driver");
                con = Database.connect();
                System.out.println("Connection Established");
                //query to delete user details by user id

                String query = "delete from userdetails where user_id = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, request.getUserId());
                int i = stmt.executeUpdate();
                if (i == 1) {
                    response5.setResMsg("User Deleted Successfully");
                    response5.setResCode("200");
                } else {
                    response5.setResMsg("Invalid User Id");
                    response5.setResCode("400");
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        responseObserver.onNext(response5.build());
        responseObserver.onCompleted();
    }

    //update password by email id
    @Override
    public void updatePass(UserService.updatepassword request, StreamObserver<UserService.Response7> responseObserver) {
        System.out.println("Inside Change Password");
        String email = request.getEmail();
        String new_password = request.getNewPassword();
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encode = encoder.encode(new_password.getBytes());
        String encPass = new String(encode);
        UserService.Response7.Builder response7 = UserService.Response7.newBuilder();
        String query1 = "select password from userdetails where email = ?";
        String query2 = "update userdetails set password = ? where email = ?";
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = Database.connect();
            System.out.println("Connection Established");
            PreparedStatement stmnt1 = con.prepareStatement(query1);
            stmnt1.setString(1,email);
            ResultSet resultSet = stmnt1.executeQuery();
            if(resultSet.next()){
                PreparedStatement stmnt2 = con.prepareStatement(query2);
                stmnt2.setString(1, encPass);
                stmnt2.setString(2, email);
                int i2 = stmnt2.executeUpdate();
                if (i2 == 1) {
                    response7.setResMsg("Password Updated Successfully");
                    response7.setResCode("200");
                    System.out.println("Password updated Successfully");
                } else {
                    response7.setResMsg("Invalid Email id");
                    response7.setResCode("400");
                    System.out.println("Invalid Email Id");
                }
            }else {
                response7.setResMsg("Email id does not exist");
                response7.setResCode("400");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onNext(response7.build());
        responseObserver.onCompleted();
    }

}




