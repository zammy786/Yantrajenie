package com.yantajenie.serviceProvider.services.SERVICES;

import com.yantajenie.serviceProvider.search.Search;
import com.yantajenie.serviceProvider.search.searchGrpc;
import com.yantajenie.serviceProvider.services.SERVICES.Enums.Brands;
import com.yantajenie.serviceProvider.services.SERVICES.Enums.Devices;
import com.yantajenie.serviceProvider.services.SERVICES.Enums.Services;
import com.yantajenie.serviceProvider.services.SpDetails;
import com.yantajenie.serviceProvider.services.serviceProviderGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceProvider extends serviceProviderGrpc.serviceProviderImplBase {
    @Override

    public void spCreateAddress(SpDetails.spAddressData request, StreamObserver<SpDetails.APIResponce> responseObserver) {
        System.out.println("Create Service Center Address ");
        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();
        try {

            //DataBase
            new ServiceDb().AddAddress(request);

            if (request.getId().equals("")) {
                responce.setResponceMessage("Id not found");
                responce.setResponceCode(100);
            } else if (request.getShopNo().equals("")) {
                responce.setResponceMessage("Shop No not found");
                responce.setResponceCode(200);
            } else if (request.getShopName().equals("")) {
                responce.setResponceMessage("Shop Name Not Found");
                responce.setResponceCode(200);
            } else if (request.getStreetName().equals("")) {
                responce.setResponceMessage("Street Name not found");
                responce.setResponceCode(200);
            } else if (request.getLandmark().equals("")) {
                responce.setResponceMessage("landmark not found");
                responce.setResponceCode(200);
            } else if (request.getCity().equals("")) {
                responce.setResponceMessage("City Detail not found");
                responce.setResponceCode(200);
            } else if (request.getState().equals("")) {
                responce.setResponceMessage("State Detail not found");
                responce.setResponceCode(200);
            } else if (request.getPinCode().equals("")) {
                responce.setResponceMessage("Pincode not found");
                responce.setResponceCode(200);
            } else {
                responce.setResponceMessage("Address Data Stored succesfully");
                responce.setResponceCode(400);
            }
            addsearchdata(request.getId());
            responseObserver.onNext(responce.build());
            responseObserver.onCompleted();
        } catch (SQLException s) {
            responce.setResponceMessage("DB Error");
            responce.setResponceCode(200);

            responseObserver.onNext(responce.build());
            responseObserver.onCompleted();
        }
    }


    @Override
    public void spCreateProfile(SpDetails.spProfileData request, StreamObserver<SpDetails.APIResponce> responseObserver) {
        System.out.println("Inside Service Provider Profile");

        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();

        try {
            //

            //DataBase
            new ServiceDb().CreateServcieProvider(request);

            if (request.getId().equals("")) {

                responce.setResponceMessage("Service Provider Id not found");
                responce.setResponceCode(200);
            } else if (request.getFirstName().equals("")) {
                responce.setResponceMessage("Service Provider First Name Not Found");
                responce.setResponceCode(200);
            } else if (request.getLastName().equals("")) {
                responce.setResponceMessage("Service Provider Last Name Not Found");
                responce.setResponceCode(200);
            } else if (request.getUserName().equals("")) {
                responce.setResponceMessage("Servcie Provider UserName Not Found");
                responce.setResponceCode(200);
            } else if (request.getPassword().equals("")) {
                responce.setResponceMessage("Servcie Provider Password Not Found");
                responce.setResponceCode(200);
            } else if (request.getMobileNumber().equals("")) {
                responce.setResponceMessage("Service Provider mobile number not found");
                responce.setResponceCode(200);
            } else if (request.getEmail().equals("")) {
                responce.setResponceMessage("Service Provider Email not found");
                responce.setResponceCode(200);
            } else if (request.getCounterAvilabale().equals("")) {
                responce.setResponceMessage("No Counter is avilabale");
                responce.setResponceCode(200);

            } else {
                responce.setResponceMessage("Service Provider Data Created");
                responce.setResponceCode(400);

            }
        } catch (Exception e) {
            responce.setResponceMessage("DB Error");
            responce.setResponceCode(200);
        }
        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();


    }

    @Override

    public void spUpdateProfileUsingId(SpDetails.spUpdateProfile request, StreamObserver<SpDetails.ProfileDetails> responseObserver) {

        System.out.println("Inside Service Provider Profile");

        SpDetails.ProfileDetails.Builder responce = SpDetails.ProfileDetails.newBuilder();

        try {
            new ServiceDb().UpdateServcieProvider(request);

            if (request.getId().equals("")) {
                responce.setResponceMessage("Service Provider Id not found");
                responce.setResponceCode(200);

            } else if (request.getFirstName().equals("")) {
                responce.setResponceMessage("Service Provider First Name Not found");
                responce.setResponceCode(200);
            } else if (request.getLastName().equals("")) {
                responce.setResponceMessage("Servcie Provider Last Name Not found");
            } else if (request.getMobileNumber().equals("")) {
                responce.setResponceMessage("Service Provider mobile number not found");
                responce.setResponceCode(200);

            } else if (request.getEmail().equals("")) {
                responce.setResponceMessage("Service Provider Email not found");
                responce.setResponceCode(200);

            } else {
                responce.setResponceMessage("Service Provider Data Updated");
                responce.setResponceCode(400);

            }
        } catch (Exception e) {
            responce.setResponceMessage("DB Error");
            responce.setResponceCode(200);
        }

        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }

    @Override
    public void spGetProfileDetailsUsingId(SpDetails.commid request, StreamObserver<SpDetails.ProfileDetails> responseObserver) {
        System.out.println("Get Profile Details Using Id");

        SpDetails.spUpdateProfile.Builder responce1 = SpDetails.spUpdateProfile.newBuilder();
        SpDetails.ProfileDetails.Builder responce = SpDetails.ProfileDetails.newBuilder();


        try {

            ResultSet rs = new ServiceDb().GetServiceProviderByID(request);
            if (!new ServiceDb().GetServiceProviderByID(request).next()) {
                responce.setResponceMessage("Data Not Found");
                responce.setResponceCode(200);
                responseObserver.onNext(responce.build());
                responseObserver.onCompleted();
                return;
            }


            while (rs.next()) {
                responce1.setId(rs.getString("id"));
                responce1.setFirstName(rs.getString("first_name"));
                responce1.setLastName(rs.getString("last_name"));
                responce1.setMobileNumber(rs.getString("mobile_number"));
                responce1.setEmail(rs.getString("email"));
                responce1.setCounterAvilable(rs.getString("counter_avilable"));
                String[] devicelist = (String[]) rs.getArray("deviceList").getArray();
                String[] brandlist = (String[]) rs.getArray("brandList").getArray();
                Date[] holidaylist = (Date[]) rs.getArray("holidayList").getArray();
                responce.addAllDeviceList(Arrays.asList(devicelist));
                responce.addAllBrands(Arrays.asList(brandlist));
                for (Date l : holidaylist
                ) {
                    responce.addHoliday(l.toString());
                }
            }


        }

//            if (request.getId().equals("")) {
//                responce.setResponceMessage("Service Provider Id not found");
//                responce.setResponceCode(200);
//            } else {
//                responce.setResponceMessage("Servcie Provider Details");
//                responce.setResponceCode(400);
//                responce1.setId(request.getId());
//                responce.setProfileDetails(responce1);
//


        catch (Exception e) {
            responce.setResponceMessage("DB Error");
            responce.setResponceCode(200);
        }
        responce.setProfileDetails(responce1);
        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }


    @Override
    public void spDeleteProfileUsingId(SpDetails.commid request, StreamObserver<SpDetails.APIResponce> responseObserver) {
        System.out.println("Delete Profile by giving Service Provider Id");
        //String id=request.getId();

        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();

        try {
            new ServiceDb().DeleteServiceProviderById(request);

            if (request.getId().equals("")) {
                responce.setResponceMessage("Service Provider Id not found");
                responce.setResponceCode(200);
            } else {
                responce.setResponceMessage("Service Provider Details Deleted Successfully");
                responce.setResponceCode(400);

            }
        } catch (Exception e) {
            responce.setResponceMessage("DB Error");
            responce.setResponceCode(200);
        }


        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }

    @Override
    public void serviceProviderStatus(SpDetails.ServiceProvider request, StreamObserver<SpDetails.APIResponce> responseObserver) {
        System.out.println("Service Provider Available Or Not");
        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();

        try {
            new ServiceDb().ServiceProviderStatus(request);

            if (request.getSpAvilable() == true) {
                responce.setResponceMessage("Servcie Provider is Avilabale");
            } else {
                responce.setResponceMessage("Service Provider is not Avilable");
            }

            if (request.getSpSlotTime().equals("")) {
                responce.setResponceMessage("Service Provider Slot Date Not Available on this " + request.getSpSlotTime() + "slot time please choose another slot");
            } else {
                responce.setResponceMessage("Service Provider available on the slot date and time you can proceed the request");
            }
            if (request.getSpTakingReq() == false) {
                responce.setResponceMessage("Service Provider Slot Date Not Available on this " + request.getSpSlotTime() + "slot time please choose another slot");
            } else {
                responce.setResponceMessage("Service Provider available on the slot date and time you can proceed the request");
            }

            if (request.getSpTakingReq() == true) {
                responce.setResponceMessage("Service Provider is taking the request on preferred date");
            } else {
                responce.setResponceMessage("Service Provider not taking the request on preferred date");
            }

        } catch (Exception e) {
            responce.setResponceMessage("DB Error");
            responce.setResponceCode(200);
        }

        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }


    @Override
    public void spUpdateAddress(SpDetails.spUpdateAddressData
                                        request, StreamObserver<SpDetails.APIResponce> responseObserver) {
        System.out.println("Update Service Provider Address");

        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();

        try {
            new ServiceDb().UpdateAddress(request);

            if (request.getId().equals("")) {
                responce.setResponceMessage("Service Id Not Entered");
            } else if (request.getCity().equals("")) {
                responce.setResponceMessage("Service Provider City Not Enterd");
            } else if (request.getLandmark().equals("")) {
                responce.setResponceMessage("Service Provider Landmark not Enterd");
            } else if (request.getPinCode().equals("")) {
                responce.setResponceMessage("Service Provider Pincode not found");
            } else if (request.getShopNo().equals("")) {
                responce.setResponceMessage("Service Provider Shop Number not found");
            } else if (request.getShopName().equals("")) {
                responce.setResponceMessage("Service Provider Shop Nmae Not found");
            } else if (request.getState().equals("")) {
                responce.setResponceMessage("Service Provider State Not Found");
            } else if (request.getStreetName().equals("")) {
                responce.setResponceMessage("Service Provider Street Name Not Found");

            } else {
                responce.setResponceMessage("Data Updated Successfully");
                responce.setResponceCode(400);
            }
        } catch (Exception e) {
            responce.setResponceMessage("DB error");
            responce.setResponceCode(200);
        }
        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();


    }

    @Override
    public void deleteAddressUsingId(SpDetails.commid
                                             request, StreamObserver<SpDetails.APIResponce> responseObserver) {
        System.out.println("Delete Service Provider Address by Id");
        // String id=request.getId();

        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();

        try {
            new ServiceDb().DeleteAddressById(request);

            if (request.getId() != request.getId()) {
                responce.setResponceMessage("Service Provider Id is incorrect");
            } else {
                responce.setResponceMessage("Service Address Deleted Successfully");
            }
        } catch (Exception e) {
            responce.setResponceMessage("DB Error");
            responce.setResponceCode(200);
        }

        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }


    @Override
    public void feedbackValid(SpDetails.commid request, StreamObserver<SpDetails.APIResponce> responseObserver){
        System.out.println("Inside Feedback Validator");
        try {
            new ServiceDb().FeedbackValidator(request,responseObserver);
        }
        catch(SQLException s)
        {
        }



    }

    public static void  addsearchdata(String id) throws SQLException {

        Search.ServiceProviderDetails.Builder request = new ServiceDb().getDB(id);

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();
        searchGrpc.searchBlockingStub stub = searchGrpc.newBlockingStub(channel);
        stub.serviceProviderDataBase(request.build());
        channel.shutdown();
    }

    @Override
    public void changePassword(SpDetails.changepassword request, StreamObserver<SpDetails.APIResponce> responseObserver) throws SQLException {
        System.out.println("Inside Change Password");

        SpDetails.APIResponce.Builder responce = SpDetails.APIResponce.newBuilder();

        new ServiceDb().ChangePassword(request,responce,responseObserver);

    }
}



