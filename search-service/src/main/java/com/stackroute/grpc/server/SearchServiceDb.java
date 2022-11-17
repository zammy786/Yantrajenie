package com.stackroute.grpc.server;

import com.stackroute.grpc.Search;

import java.sql.*;

public class SearchServiceDb {

    private final String url = "jdbc:postgresql://localhost:5432/search_service";
    private final String username = "postgres";
    private final String password = "test123";

    private final Connection conn = DriverManager.getConnection(this.url, this.username, this.password);


    private Statement stmt = conn.createStatement();


    public SearchServiceDb() throws SQLException {
    }

    public ResultSet SearchServiceprovider(String query) throws SQLException {

        ResultSet rs = stmt.executeQuery(query);
        conn.close();
        return rs;


    }

    public void SearchDataBase(Search.ServiceProviderDetails request) throws SQLException {
        StringBuilder sb = new StringBuilder("insert into service_provider(id,mobile_number,first_name,last_name,email,city,shopname,shopno,landmark,streetname,pincode,state) values");
        sb.append("(");
        sb.append("'").append(request.getId()).append("',");
        sb.append("'").append(request.getMobileNumber()).append("',");
        sb.append("'").append(request.getFirstName()).append("',");
        sb.append("'").append(request.getLastName()).append("',");
        sb.append("'").append(request.getEmail()).append("',");
        sb.append("'").append(request.getCity()).append("',");
        sb.append("'").append(request.getShopname()).append("',");
        sb.append("'").append(request.getShopno()).append("',");
        sb.append("'").append(request.getLandmark()).append("',");
        sb.append("'").append(request.getStreetname()).append("',");
        sb.append("'").append(request.getPincode()).append("',");
        sb.append("'").append(request.getState()).append("')");
        System.out.println(sb);
        stmt.execute(sb.toString());
        System.out.println(request.getEmail());
        String query="";
        for (String s:request.getDeviceListList()
             ) {
             query = "update service_provider set devicelist=array_append(devicelist,'"+s+"') where id='"+request.getId()+"'";
             stmt.execute(query);
        }
        System.out.println(query);
        query = "";
        for (String s:request.getBrandsList()
        ) {
             query = "update service_provider set brandlist=array_append(brandlist,'"+s+"') where id='"+request.getId()+"'";
            stmt.execute(query);
        }
        conn.close();
    }
}
