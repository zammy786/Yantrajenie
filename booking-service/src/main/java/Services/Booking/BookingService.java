package Services.Booking;

import CommunicationChannels.ClientCalls;
import DButility.YantraDButil;
import Validators.Booking.BookingValidators;
import com.yantragenie.bookings.Booking;
import com.yantragenie.bookings.bookingGrpc;
import com.yantragenie.userdetail.UserService;
import io.grpc.stub.StreamObserver;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingService extends bookingGrpc.bookingImplBase {

    @Override
    public void getBookingDetailsUsingId(Booking.commonid request, StreamObserver<Booking.bookingDetails> responseObserver){

        Booking.bookingDetails.Builder details = Booking.bookingDetails.newBuilder();

        try{
            //calling status service and fetch status
            String bookingdetails = new ClientCalls().getBookingStauts(request.getId());
            ResultSet rs = new YantraDButil().getBookingDetailById(request.getId());
            if(!rs.next()){
                //checking for available booking with this id
                details.setResponseMessage("No Booking with this id").setResponseCode(200);
            }
            else {
                details.setEmail(rs.getString("email"));
                details.setId(rs.getString("id"));
                details.setFirstName(rs.getString("firstname"));
                details.setLastName(rs.getString("lastname"));
                details.setMobileNumber(rs.getString("mobilenumber"));
                details.setBookingdate(rs.getString("bookingdate"));
                details.setPrefferdServiceLocation(rs.getString("preferredlocation")).setDevice(rs.getString("device")).setIssueDescription(rs.getString("issuedesc")).setServieProviderId(rs.getString("serviceproviderid")).setUserId(rs.getString("userid")).setResponseCode(200).setResponseMessage("SUCCESS");
                details.setServiceDeviceBrand(rs.getString("servicedevicebrand"));
                details.setStatus(bookingdetails);
                details.setPreferredTimeSlot(rs.getString("timeslot"));
                details.setPreferredDaySlot(rs.getString("preferredday"));

            }



        }catch (SQLException s){
            details.clear();
            details.setResponseMessage("Database Connection Error").setResponseCode(400);
        }catch (NullPointerException n){
            details.clear();
            details.setResponseMessage("Null Value Found").setResponseCode(400);

        }catch (Exception e){
            details.clear();
            details.setResponseMessage("ERROR").setResponseCode(400);
        }
        responseObserver.onNext(details.build());
        responseObserver.onCompleted();

    }

    @Override
    public void createBooking(Booking.bookingCreate request, StreamObserver<Booking.BookingApiResponse> responseObserver) {
        Booking.BookingApiResponse.Builder createBooking = Booking.BookingApiResponse.newBuilder();


        try {
            //checking if service provider id is valid
            if((new ClientCalls().getSpDetails(request.getServiceproviderid()).getResponceMessage().equals("Data Not Found"))){
                createBooking.setResponseMessage("No Service Provider Found For this Id").setResponseCode(200);
                responseObserver.onNext(createBooking.build());
                responseObserver.onCompleted();
                return;
            }
            UserService.Response2 userdetail = new ClientCalls().getUserDetails(request.getUserid());

//            verifying if user exist with this id
            if(userdetail.getResCode().equals("400 - User Not Exist")){
                createBooking.setResponseMessage("No User Found For this Id").setResponseCode(200);
                responseObserver.onNext(createBooking.build());
                responseObserver.onCompleted();
                return;
            }

            //field validations
            if(!(new BookingValidators().fieldValidate(request).equals("SUCCESS"))){
                createBooking.setResponseCode(200).setResponseMessage(new BookingValidators().fieldValidate(request));
                responseObserver.onNext(createBooking.build());
                responseObserver.onCompleted();
                return;
            }

            //validating if time slot exists or not
            if(!(new BookingValidators().timeSlotCreateValidate(request).equals("SUCCESS"))){
                createBooking.setResponseCode(200).setResponseMessage(new BookingValidators().timeSlotCreateValidate(request));
                responseObserver.onNext(createBooking.build());
                responseObserver.onCompleted();
                return;

            }
            String id = new YantraDButil().createNewBooking(request,userdetail);
            createBooking.setResponseMessage("Booking Success").setResponseCode(200).setId(id);
            new ClientCalls().insertBooking(id,userdetail.getEmail());
            ResultSet rs = new YantraDButil().getBookingDetailById(id);
            if(rs.next()){
                new ClientCalls().sendEmail(rs.getString("email"),"Booking Created for ID:"+id+" at time "+request.getPreferredDaySlot()+" "+request.getPreferredTimeSlot());

            }


        }catch (SQLException s){
            createBooking.clear();
            createBooking.setResponseMessage("DB error").setResponseCode(400);
        }catch (Exception e){
            createBooking.setResponseCode(400).setResponseMessage("ERROR");
        }

        responseObserver.onNext(createBooking.build());
        responseObserver.onCompleted();

    }

    @Override
    public void getBookingDetailsUsingServiceProviderId(Booking.commonid request, StreamObserver<Booking.userBookings> responseObserver) {
        Booking.userBookings.Builder listOfbookings = Booking.userBookings.newBuilder();
        Booking.bookingUpdateData.Builder details = Booking.bookingUpdateData.newBuilder();

        try {

            //checking if service provider id is valid
            if((new ClientCalls().getSpDetails(request.getId()).getResponceMessage().equals("Data Not Found"))){
                listOfbookings.setResponseMessage("No Service Provider Found For this Id").setResponseCode(200);
                responseObserver.onNext(listOfbookings.build());
                responseObserver.onCompleted();
                return;
            }


            ResultSet rs = new YantraDButil().getBookingDetailsFromServiceProviderId(request.getId());
            int i = 0;
            while(rs.next()){

                details.setEmail(rs.getString("email"));
                details.setId(rs.getString("id"));
                details.setFirstName(rs.getString("firstname"));
                details.setLastName(rs.getString("lastname"));
                details.setMobileNumber(rs.getString("mobilenumber"));
                details.setBookingdate(rs.getString("bookingdate"));
                details.setPrefferdServiceLocation(rs.getString("preferredlocation")).setDevice(rs.getString("device")).setIssueDescription(rs.getString("issuedesc")).setServieProviderId(rs.getString("serviceproviderid")).setUserId(rs.getString("userid"));
                details.setServiceDeviceBrand(rs.getString("servicedevicebrand"));
                //fetch status of each bookings
                details.setStatus(new ClientCalls().getBookingStauts(rs.getString("id")));
                details.setPreferredTimeSlot(rs.getString("timeslot"));
                details.setPreferredDaySlot(rs.getString("preferredday"));
                listOfbookings.setBdetails(details);
                listOfbookings.setResponseCode(200).setResponseMessage("SUCCESS");
                responseObserver.onNext(listOfbookings.build());
                i++;
            }
            if(i == 0){
                listOfbookings.clear();
                listOfbookings.setResponseMessage("No Bookings for this service provider").setResponseCode(200);
                responseObserver.onNext(listOfbookings.build());
            }
            responseObserver.onCompleted();
            return;

        }catch (SQLException s){
            listOfbookings.clear();
            listOfbookings.setResponseCode(400).setResponseMessage("DB Error");
        }catch (Exception e){
            listOfbookings.clear();
            listOfbookings.setResponseCode(400).setResponseMessage("ERROR");
        }

        responseObserver.onNext(listOfbookings.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getBookingDetailUsingUserId(Booking.commonid request, StreamObserver<Booking.userBookings> responseObserver) {
        Booking.userBookings.Builder listOfbookings = Booking.userBookings.newBuilder();
        Booking.bookingUpdateData.Builder details = Booking.bookingUpdateData.newBuilder();

        try {


            UserService.Response2 userdetail = new ClientCalls().getUserDetails(request.getId());
            //verifying if user exist with this id
            if(userdetail.getResCode().equals("400 - User Not Exist")){
                listOfbookings.setResponseMessage("No User Found For this Id").setResponseCode(200);
                responseObserver.onNext(listOfbookings.build());
                responseObserver.onCompleted();
                return;
            }



            ResultSet rs = new YantraDButil().getBookingDetailsFromUserId(request.getId());

            int i = 0;
            while(rs.next()){


                details.setEmail(rs.getString("email"));
                details.setId(rs.getString("id"));
                details.setFirstName(rs.getString("firstname"));
                details.setLastName(rs.getString("lastname"));
                details.setMobileNumber(rs.getString("mobilenumber"));
                details.setBookingdate(rs.getString("bookingdate"));
                details.setPrefferdServiceLocation(rs.getString("preferredlocation")).setDevice(rs.getString("device")).setIssueDescription(rs.getString("issuedesc")).setServieProviderId(rs.getString("serviceproviderid")).setUserId(rs.getString("userid"));
                details.setServiceDeviceBrand(rs.getString("servicedevicebrand"));
                //fetch status of each bookings
                details.setStatus(new ClientCalls().getBookingStauts(rs.getString("id")));
                details.setPreferredTimeSlot(rs.getString("timeslot"));
                details.setPreferredDaySlot(rs.getString("preferredday"));
                listOfbookings.setResponseMessage("SUCCESS").setResponseCode(200);
                listOfbookings.setBdetails(details);
                responseObserver.onNext(listOfbookings.build());
                i++;
            }
            if(i == 0){
                listOfbookings.setResponseMessage("No Bookings for this user").setResponseCode(200);
                responseObserver.onNext(listOfbookings.build());
            }
            responseObserver.onCompleted();
            return;

        }catch (SQLException s){
            listOfbookings.clear();
            listOfbookings.setResponseCode(400).setResponseMessage("DB Error");
        }catch (Exception e){
            listOfbookings.clear();
            listOfbookings.setResponseMessage("ERROR").setResponseCode(400);
        }

        responseObserver.onNext(listOfbookings.build());
        responseObserver.onCompleted();
    }


    @Override
    public void updateBooking(Booking.bookingupdatepayload request, StreamObserver<Booking.BookingApiResponse> responseObserver) {
        Booking.BookingApiResponse.Builder response = Booking.BookingApiResponse.newBuilder();

            try {
                //check if booking exist or not
                if(!(new YantraDButil().getBookingDetailById(request.getBookingid()).next())) {
                    response.setResponseMessage("No Booking with this id").setResponseCode(200);
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                    return;
                }

                //Booking can only be updated if Ticket not generated
                if(new YantraDButil().getTicketDetailById(request.getBookingid()).next()){
                    response.setResponseMessage("Can't update this booking Ticket Already Generated").setResponseCode(200);
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                    return;

                }

                //booking can only be updated when it is in confirmed status
                if(!(new ClientCalls().getBookingStauts(request.getBookingid()).equals("CONFIRMED"))){
                    response.setResponseCode(200).setResponseMessage("BOOKING CAN NOT BE UPDATED NOW");
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                    return;
                }

                //validates fields
                if(!(new BookingValidators().fValidateUpdate(request).equals("SUCCESS"))){
                    response.setResponseCode(200).setResponseMessage(new BookingValidators().fValidateUpdate(request));
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                    return;
                }

                //checking if timeslot is available
                if(!(new BookingValidators().timeSlotUpdateValidate(request).equals("SUCCESS"))){
                    response.setResponseCode(200).setResponseMessage(new BookingValidators().timeSlotUpdateValidate(request));
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                    return;
                }


                String id =  new YantraDButil().updateBooking(request);
                response.setId(id).setResponseMessage("SUCCESS").setResponseCode(200);
                ResultSet rs = new YantraDButil().getBookingDetailById(request.getBookingid());
                if(rs.next()){
                    new ClientCalls().sendEmail(rs.getString("email"),"Booking Updated for ID:"+request.getBookingid());

                }


            }catch (SQLException s){
                response.setResponseCode(400).setResponseMessage("DB ERROR");
            }catch (Exception e){
                response.setResponseCode(400).setResponseMessage("ERROR");
            }

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }

    @Override
    public void cancelBooking(Booking.commonid request, StreamObserver<Booking.commonResponse> responseObserver) {
        Booking.commonResponse.Builder response = Booking.commonResponse.newBuilder();
        try{
            //checking if booking is available with this id
            if(!(new YantraDButil().getBookingDetailById(request.getId()).next())){
                response.setResponseCode(200).setResponseMessage("No Booking With This ID");
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
                return;

            }
            //if booking has passed the confirmation phase it can not be cancelled
            if(!(new ClientCalls().getBookingStauts(request.getId()).equals("CONFIRMED"))){
                response.setResponseMessage("TICKET ALREADY GENERATED").setResponseCode(200);
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
                return;
            }
            new ClientCalls().updateBookingStatus(request.getId(),"CANCELLED");
            response.setResponseMessage("SUCCESS").setResponseCode(200);
            ResultSet rs = new YantraDButil().getBookingDetailById(request.getId());
            if(rs.next()){
                new ClientCalls().sendEmail(rs.getString("email"),"Booking Cancelled for ID:"+request.getId());

            }


        }catch (SQLException e){
            response.setResponseMessage("DB ERROR").setResponseCode(400);

        }catch (Exception s){
            response.setResponseCode(400).setResponseMessage("ERROR");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
