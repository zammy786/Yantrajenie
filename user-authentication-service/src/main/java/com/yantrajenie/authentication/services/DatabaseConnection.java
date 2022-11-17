package com.yantrajenie.authentication.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/registrationdb";
    private static final String user = "postgres";
    private static final String pass = "test123";

    public static Connection connect(){
        System.out.println("Inside the connection method");
        Connection con = null;
        try{
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connection established");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
