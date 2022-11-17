package com.yantajenie.serviceProvider.services.SERVICES;


import com.yantajenie.serviceProvider.search.Search;
import com.yantajenie.serviceProvider.services.SpDetails;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ServiceDb {

    private final String url = "jdbc:postgresql://localhost:5432/serviceproviderdb";
    private final String username = "postgres";
    private final String password = "test123";

    private final Connection conn = DriverManager.getConnection(this.url, this.username, this.password);

    public ServiceDb() throws SQLException {
    }

    private Statement stmt = conn.createStatement();


    public void AddAddress(SpDetails.spAddressData request) throws SQLException {
        System.out.println("Inside Address DB");
        StringBuilder string = new StringBuilder("Insert into serviceprovideraddress(id,shop_no,shopname,street_name,landmark,city,state,pincode)");
        string.append("Values ('").append(request.getId()).append("','").append(request.getShopNo()).append("','").append(request.getShopName()).append("','").append(request.getStreetName()).append("','").append(request.getLandmark()).append("','").append(request.getCity()).append("','").append(request.getState()).append("','").append(request.getPinCode()).append("')");
        stmt.execute(string.toString());
        System.out.println("Address Added succesfully");


        conn.close();
    }

    public void CreateServcieProvider(SpDetails.spProfileData request) throws SQLException {
        System.out.println("Inside Service Provider Profile DB");
        StringBuilder query = new StringBuilder("Insert into serviceproviderprofile(id,first_name,last_name,username,password,email,mobile_number,counter_avilable)");
        query.append("Values ('").append(request.getId()).append("','").append(request.getFirstName()).append("','").append(request.getLastName()).append("','").append(request.getUserName()).append("','").append(request.getPassword()).append("','").append(request.getEmail()).append("','").append(request.getMobileNumber()).append("','").append(request.getCounterAvilabale()).append("')");
        //StringBuilder deviceList=new StringBuilder(("Insert into device");
        stmt.execute(query.toString());

        for (String s:request.getDeviceListList()
        ) {
            String query1="UPDATE serviceproviderprofile SET devicelist = array_append(devicelist,'"+s+"') where id ='" +request.getId()+"'";
            System.out.println(query1);
            stmt.executeUpdate(query1);
        }

        for (String t:request.getBrandsList()
        ) {
            String query1="UPDATE serviceproviderprofile SET brandlist = array_append(brandlist,'"+t+"') where id ='" +request.getId()+"'";
            System.out.println(query1);
            stmt.executeUpdate(query1);

        }


        for (String s:request.getHolidayList()
        ) {
            String query1="UPDATE serviceproviderprofile SET holidaylist = array_append(holidaylist,'"+s+"') where id ='" +request.getId()+"'";
            System.out.println(query1);
            stmt.executeUpdate(query1);

        }

        System.out.println("Profile Created Successfully");

        conn.close();

    }

    public void UpdateServcieProvider(SpDetails.spUpdateProfile request) throws SQLException {
        System.out.println("Inside Update Servcie Provider DB");
        StringBuilder query = new StringBuilder("UPDATE serviceproviderprofile SET first_name ='" + request.getFirstName() + "'WHERE id ='" + request.getId() + "'");
        StringBuilder query1 = new StringBuilder("UPDATE serviceproviderprofile SET last_name ='" + request.getLastName() + "'WHERE id ='" + request.getId() + "'");
        StringBuilder query2 = new StringBuilder("UPDATE serviceproviderprofile SET mobile_number ='" + request.getMobileNumber() + "'WHERE id ='" + request.getId() + "'");
        StringBuilder query3 = new StringBuilder("UPDATE serviceproviderprofile SET email ='" + request.getEmail() + "'WHERE id ='" + request.getId() + "'");
        StringBuilder query4 = new StringBuilder("UPDATE serviceproviderprofile SET counter_avilable ='" + request.getCounterAvilable() + "'WHERE id ='" + request.getId() + "'");


        stmt.executeUpdate(query.toString());
        System.out.println("Service Provider First Name Updated");
        stmt.executeUpdate(query1.toString());
        System.out.println("Service Provider Last Name Updated");
        stmt.executeUpdate(query2.toString());
        System.out.println("Service Provider Mobile Number Updated");
        stmt.executeUpdate(query3.toString());
        System.out.println("Service Provider Email Updated");
        stmt.executeUpdate(query4.toString());
        System.out.println("Serive provider Counter Updated");

        conn.close();
    }

    public ResultSet GetServiceProviderByID(SpDetails.commid request) throws SQLException {
        System.out.println("Inside Get Service Provider by Id DB");
        StringBuilder query = new StringBuilder("select * from serviceproviderprofile where id = '" + request.getId() + "'");
        System.out.println(query);
        //stmt.execute(query.toString());

        System.out.println("Profile Fetched");
        return stmt.executeQuery(query.toString());

    }

    public void DeleteServiceProviderById(SpDetails.commid request) throws SQLException {
        System.out.println("Inside Delete table by Id DB");
        StringBuilder query = new StringBuilder("DELETE FROM serviceproviderprofile  WHERE id ='" + request.getId() + "'");
        stmt.execute(query.toString());
        System.out.println("Profile Deleted");

        conn.close();
    }

    public void ServiceProviderStatus(SpDetails.ServiceProvider request) throws SQLException {
        System.out.println("Inside Service Provider Status");
        if (request.getSpAvilable() == true) {
            StringBuilder query = new StringBuilder("INSERT INTO serviceproviderstatus (sp_avilable)");
            query.append("Values ('").append("Service Provider is Avilable").append("')");
            stmt.execute(query.toString());
        } else {
            StringBuilder query1 = new StringBuilder("INSERT INTO serviceproviderstatus (sp_avilable)");
            query1.append("Values ('").append("Service Provider is not Avilable").append("')");
            stmt.execute(query1.toString());
        }

        StringBuilder query2 = new StringBuilder("INSERT INTO serviceproviderstatus (sp_slottime)");
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        query2.append("Values ('").append(formattedDate).append("')");
        stmt.execute(query2.toString());

        if (request.getSpTakingReq() == true) {
            StringBuilder query = new StringBuilder("INSERT INTO serviceproviderstatus (sp_takingreq)");
            query.append("Values ('").append("Servcie Provider Taking the Request").append("')");
            stmt.execute(query.toString());
        } else {
            StringBuilder query = new StringBuilder("INSERT INTO serviceproviderstatus (sp_takingreq)");
            query.append("Values ('").append("Servcie Provider not taking the Request").append("')");
            stmt.execute(query.toString());
        }

        conn.close();
    }

    public void UpdateAddress(SpDetails.spUpdateAddressData request) throws SQLException {
        System.out.println("Inside Update Address DB");
        StringBuilder query = new StringBuilder("UPDATE serviceprovideraddress SET shop_no ='" + request.getShopNo() + "' WHERE id ='" + request.getId() + "'");
        StringBuilder query1 = new StringBuilder("UPDATE serviceprovideraddress SET street_name ='" + request.getShopNo() + "' WHERE id ='" + request.getId() + "'");
        StringBuilder query2 = new StringBuilder("UPDATE serviceprovideraddress SET city ='" + request.getShopNo() + "' WHERE id ='" + request.getId() + "'");
        StringBuilder query3 = new StringBuilder("UPDATE serviceprovideraddress SET state ='" + request.getShopNo() + "' WHERE id ='" + request.getId() + "'");
        StringBuilder query4 = new StringBuilder("UPDATE serviceprovideraddress SET pincode ='" + request.getShopNo() + "' WHERE id ='" + request.getId() + "'");
        StringBuilder query5 = new StringBuilder("UPDATE serviceprovideraddress SET shopname ='" + request.getShopName() + "' WHERE id ='" + request.getId() + "'");

        stmt.executeUpdate(query.toString());
        System.out.println("Service Provider Shop_No Updated");
        stmt.executeUpdate(query1.toString());
        System.out.println("Service provider Street_Name Updated ");
        stmt.executeUpdate(query2.toString());
        System.out.println("Service Provider City Updated");
        stmt.executeUpdate(query3.toString());
        System.out.println("Service Provider State Updted");
        stmt.executeUpdate(query4.toString());
        System.out.println("Servcie Provider Pincode Updated");
        stmt.executeUpdate(query5.toString());
        System.out.println("Service Provider Shop Name Updated");

        conn.close();
    }

    public void DeleteAddressById(SpDetails.commid request) throws SQLException {
        System.out.println("Inside Delete Address by Id");
        StringBuilder query = new StringBuilder("DELETE FROM serviceprovideraddress WHERE id ='" + request.getId() + "'");
        stmt.execute(query.toString());
        System.out.println("Address Deleted");

        conn.close();

    }

    public void FeedbackValidator(SpDetails.commid request, StreamObserver<SpDetails.APIResponce> responseObserver) throws SQLException {
        System.out.println("Inside Feedback Validator");
        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();
        StringBuilder query=new StringBuilder("select * from serviceproviderprofile where id = '"+request.getId()+"'");
        ResultSet rs=stmt.executeQuery(query.toString());
        int SpId = Integer.parseInt(request.getId());
        if(SpId>0) {
            if (rs.next()) {
                responce.setResponceMessage("Service Provider Exist");
                responce.setResponceCode(400);
            } else {
                responce.setResponceMessage("Servcie Provider Not Exist");
                responce.setResponceCode(200);
            }
        }
        else{
            responce.setResponceMessage("Invalid User Id Please Check Id and Enter Again");
         //   responce.getResponceCode(200);
        }

        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();


        conn.close();


    }

    public Search.ServiceProviderDetails.Builder getDB(String id) throws SQLException {
        String query="select p.id, p.first_name,p.last_name,p.mobile_number,p.email,a.city,a.shopname,a.shop_no,a.landmark,a.street_name,a.pincode,a.state,p.devicelist,p.brandlist from " +
                "serviceproviderprofile as p inner join serviceprovideraddress as a on p.id = a.id where p.id = '"+id+"'";
        ResultSet rs=stmt.executeQuery(query);
        Search.ServiceProviderDetails.Builder request = null;

        while(rs.next()){
            request.setId(rs.getString("id"));
            request.setEmail(rs.getString("email"));
            request.setCity(rs.getString("city"));
            request.setFirstName(rs.getString("first_name"));
            request.setLastName(rs.getString("last_name"));
            request.setMobileNumber(rs.getString("mobile_number"));
            request.setShopname(rs.getString("shopname"));
            request.setShopno(rs.getString("shop_no"));
            request.setLandmark(rs.getString("landmark"));
            request.setPincode(rs.getString("pincode"));
            request.setState(rs.getString("state"));
            String[] devicelist = (String[]) rs.getArray("deviceList").getArray();
            String[] brandlist = (String[]) rs.getArray("brandList").getArray();

            request.addAllBrands(Arrays.asList(brandlist));
            request.addAllDeviceList(Arrays.asList(devicelist));
        }


        return request;
    }

    public void ChangePassword(SpDetails.changepassword request, SpDetails.APIResponce.Builder responce, StreamObserver<SpDetails.APIResponce> responseObserver) throws SQLException {
        System.out.println("Inside Change Password");
        if(request.getOldPassword().equals("")){
            responce.setResponceMessage("Old Password Not Found");
            responce.setResponceCode(200);

        }

        String query="Select password from serviceproviderprofile";
        ResultSet rs=stmt.executeQuery(query);
        if(request.getOldPassword().equals(rs.next())){
            responce.setResponceMessage("Correct Passowrd");
            responce.setResponceCode(400);
        }
        else {
            responce.setResponceMessage("Enterd Wroung Password");
            responce.setResponceCode(200);
        }

        if(request.getNewPassword().equals(request.getCheckNewPassword())){
            String query1="UPDATE serviceproviderprofile SET password = '"+request.getCheckNewPassword()+"'WHERE password= '"+request.getOldPassword()+"'";
            stmt.executeUpdate(query1);
            responce.setResponceMessage("Password Updated Succesfully");
            responce.setResponceCode(400);

        }
        else{
            responce.setResponceMessage("Please write correct passowrd again");
            responce.setResponceCode(200);
        }
        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }
}
