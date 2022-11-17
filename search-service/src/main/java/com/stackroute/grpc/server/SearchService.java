package com.stackroute.grpc.server;

import java.sql.*;
import java.util.Arrays;

import com.stackroute.grpc.Search;
import com.stackroute.grpc.searchGrpc;;
import io.grpc.stub.StreamObserver;

public class SearchService extends searchGrpc.searchImplBase{

    @Override
    public void searchServiceProvider(Search.Serviceprovider request, StreamObserver<Search.ServiceProviderDetails> responseObserver) {
        String city=request.getCity();

        Search.ServiceProviderDetails.Builder response= Search.ServiceProviderDetails.newBuilder();
        StringBuilder query = new StringBuilder("select * from service_provider where 1=1 ");
        if(city != ""){
            query.append("and city ='").append(city).append("' ");
        }
        if(request.getBrands() != ""){
            query.append("and '").append(request.getBrands()).append("' = any(brandlist) ");
        }

        if(request.getDevices() != ""){
            query.append("and '").append(request.getDevices()).append("' = any(devicelist) ");
        }

        try{
            ResultSet rs = new SearchServiceDb().SearchServiceprovider(query.toString());
            int i = 0;
            while(rs.next()){
                response.setEmail(rs.getString("email"));
                response.setCity(rs.getString("city"));
                response.setState(rs.getString("state"));
                response.setShopname(rs.getString("shopname"));
                response.setMobileNumber(rs.getString("mobile_number"));
                response.setFirstName(rs.getString("first_name"));
                response.setLandmark(rs.getString("landmark"));
                response.setLastName(rs.getString("last_name"));
                response.setPincode(rs.getString("pincode"));
                response.setStreetname(rs.getString("streetname"));
                response.setId(rs.getString("id"));
                String[] devicelist = (String[]) rs.getArray("deviceList").getArray();
                String[] brandlist = (String[]) rs.getArray("brandList").getArray();
                response.addAllBrands(Arrays.asList(brandlist));
                response.addAllDeviceList(Arrays.asList(devicelist));
                response.setResponceMessgae("SUCCESS").setResponceCode(200);
                responseObserver.onNext(response.build());
                i++;

            }
            if(i == 0){
                response.setResponceCode(200).setResponceMessgae("No Service provider Matches Your Need");
                responseObserver.onNext(response.build());
            }
            responseObserver.onCompleted();
            return;
        }catch (Exception e){
            response.clear();
            response.setResponceCode(400).setResponceMessgae("Failure");
            responseObserver.onNext(response.build());
        }
        responseObserver.onCompleted();


    }

    @Override
    public void serviceProviderDataBase(Search.ServiceProviderDetails request, StreamObserver<Search.ApiResponse> responseObserver) {
        System.out.println("Inside Service Provider Data Base");
        Search.ApiResponse.Builder response = Search.ApiResponse.newBuilder();

        try {
            new SearchServiceDb().SearchDataBase(request);
            response.setResponseCode(200).setResponseMessage("SUCCESS");
        }catch (Exception e){
            response.clear();
            System.out.println(e);
            response.setResponseMessage("FAILED").setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}