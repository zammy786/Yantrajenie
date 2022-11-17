package service;

import ClientCalls.ClientCalls;
import generated.Status;
import generated.bookingStatusGrpc;
import io.grpc.stub.StreamObserver;
import model.StatusModel;
import service.ienums.BookingStatus;
import service.ienums.TicketStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatusServer extends bookingStatusGrpc.bookingStatusImplBase{

    @Override
    public void showStatus(Status.Request request, StreamObserver<Status.Response> responseObserver) {
        DatabaseService databaseService = new DatabaseService();
        StatusModel statusModel;
        Status.Response.Builder response = Status.Response.newBuilder(); // 1 LINE
        try {
            statusModel = databaseService.getBookingStatusForId(request.getId()); // this method store in statusmodel
            // call getBookingStatusforId of databaseService class which return object of statusModel
            response.setBookingStatus(statusModel.getBooking_status()); // 2LINE
            response.setTicketStatus(statusModel.getTicket_status()); //3 LINE
            //  response.setStatus_Code(statusModel.getStatus_Code()); //3 LINE for understanding purpose

        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setStatusCode(200);
        responseObserver.onNext(response.build()); // adding response to response observer
        responseObserver.onCompleted();

    }

    @Override
    public void updateTicketStatus(Status.UpdateRequest request, StreamObserver<Status.Response> responseObserver) {
        DatabaseService databaseService = new DatabaseService();
        Status.Response.Builder response = Status.Response.newBuilder();
        StatusModel statusModel;
        List<String> enumlist = new ArrayList<>();
        Arrays.stream(TicketStatus.values()).forEach(e ->enumlist.add(e.toString())); //java 8 stream to perform some operation
        if (!enumlist.contains(request.getStatus())){
            response.setResponseMessage("INVALID TICKET_STATUS").setStatusCode(200);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
            return;

        }

        if(request.getStatus().equals(TicketStatus.GENERATED.name()) || request.getStatus().equals(TicketStatus.NOT_GENERATED.name())){
            response.setResponseMessage("INVALID TICKET_STATUS").setStatusCode(200);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
            return;

        }

        try {
            statusModel = databaseService.updateTicketStatus(request.getId(), request.getStatus());

            response.setBookingStatus(statusModel.getBooking_status());
            response.setTicketStatus(statusModel.getTicket_status());
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setStatusCode(200);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateBookingStatus(Status.UpdateRequest request, StreamObserver<Status.Response> responseObserver) {
        DatabaseService databaseService = new DatabaseService();
        StatusModel statusModel;
        Status.Response.Builder response = Status.Response.newBuilder();
        if(!(request.getStatus().equals(BookingStatus.CANCELLED.name()))){
                response.setResponseMessage("INVALID BOOKING STATUS").setStatusCode(200);
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
                return;
        }

        try{

            statusModel = databaseService.updateBookingStatus(request.getId(), request.getStatus());
            response.setTicketStatus(statusModel.getTicket_status());
            response.setBookingStatus(statusModel.getBooking_status());
            response.setStatusCode(200);
            new ClientCalls().sendEmail(new DatabaseService().getbookingEmail(request.getId()),"Ticket Status Updated to "+statusModel.getTicket_status()+" for booking id"+request.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void insertNewBooking(Status.Request request, StreamObserver<Status.Response> responseObserver) {
        DatabaseService databaseService = new DatabaseService();
        StatusModel statusModel;
        Status.Response.Builder response = Status.Response.newBuilder();
        try {
            statusModel = databaseService.insertNewBooking(request.getId(), request.getEmail());
            response.setBookingStatus(statusModel.getBooking_status());
            response.setTicketStatus(statusModel.getTicket_status());
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setStatusCode(200);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
