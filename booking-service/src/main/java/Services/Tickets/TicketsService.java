package Services.Tickets;

import CommunicationChannels.ClientCalls;
import DButility.YantraDButil;
import Validators.Tickets.TicketValidator;
import com.yantragenie.ticket.Ticket;
import com.yantragenie.ticket.ticketGrpc;
import io.grpc.stub.StreamObserver;
import java.sql.ResultSet;
import java.sql.SQLException;


//ticket is generated when customer hand over device to servicing technician or service centre
public class TicketsService extends ticketGrpc.ticketImplBase {


    @Override
    public void getTicketFromBookingId(Ticket.uniqueId request, StreamObserver<Ticket.ticketdetails> responseObserver) {

        Ticket.ticketdetails.Builder ticket = Ticket.ticketdetails.newBuilder();
        try {

            //call status service and fetchdata
            ResultSet rs = new YantraDButil().getTicketDetailById(request.getId());
            if(rs.next()){
                ticket.setBookingid(rs.getString("bookingid"));
                ticket.setPreferredLocation(rs.getString("preferredlocation"));
                ticket.setDevice(rs.getString("device"));
                ticket.setServicedevicebrand(rs.getString("servicedevicebrand"));
                ticket.setTicketstatus(new ClientCalls().getTicketStatus(request.getId()));
                ticket.setUserid(rs.getString("userid"));
                ticket.setServiceproviderid(rs.getString("serviceproviderid"));
                ticket.setIssuedesc(rs.getString("issuedesc"));
                ticket.setTicketgenerationdate(rs.getString("ticketgenerationdate"));
                ticket.setUpdatedon(rs.getString("updatedon"));
                ticket.setTechnicialcontactnumber(rs.getString("techniciancontactnumber"));
                ticket.setTechnicianname(rs.getString("technicianname"));
                ticket.setEstimatedservicedays(Integer.parseInt(rs.getString("estimatedservicedays")));
                ticket.setResponseCode(200);
                ticket.setResponseMessage("SUCCESS");

            }else {
                ticket.setResponseMessage("No ticket with this booking id").setResponseCode(200);
            }
        } catch (SQLException e) {
            ticket.setResponseCode(400).setResponseMessage("DB ERROR");
        }catch (Exception r){
            ticket.setResponseMessage("ERROR").setResponseCode(400);
        }
        responseObserver.onNext(ticket.build());
        responseObserver.onCompleted();
    }

    @Override
    public void createTicket(Ticket.ticketcreatepayload request, StreamObserver<Ticket.id> responseObserver) {
        Ticket.id.Builder response = Ticket.id.newBuilder();
        try {

            //validating user inputs
            if (!(new TicketValidator().ticketUpdateCreateFieldValidator(request).equals("SUCCESS"))) {
                response.setResponseCode(200).setResponseMessage(new TicketValidator().ticketUpdateCreateFieldValidator(request));
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
                return;
            }
            ResultSet  status = new YantraDButil().getBookingDetailById(request.getId());
            if(!(status.next())){
                //checking booking exist with this id
                response.setResponseCode(200).setResponseMessage("No Booking exists with this id");
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
                return;
            }
            //if booking is cancelled you can not ge
            String stautsBooking = new ClientCalls().getBookingStauts(request.getId());
            if(stautsBooking.equals("CANCELLED")){
                response.setResponseCode(200).setResponseMessage("booking is cancelled can not generate ticket");
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
                return;
            }

            //checking if already ticket is generated with this  booking
            if(new YantraDButil().getTicketDetailById(request.getId()).next()){
                response.setResponseCode(200).setResponseMessage("Ticket Already Generated");
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
                return;
            }

                //fetching booking details
                ResultSet rs = new YantraDButil().getBookingDetailById(request.getId());

            //the ticket creation will automatically change booking status to TICKET_GENERATED

                new YantraDButil().createNewTicket(request,rs);
                response.setId(request.getId());
                response.setResponseMessage("SUCCESS").setResponseCode(200);
                new ClientCalls().updateTicketStatus(request.getId(),"GENERATED");
            ResultSet rs2 = new YantraDButil().getBookingDetailById(request.getId());
            if(rs2.next()){
                new ClientCalls().sendEmail(rs2.getString("email"),"Ticket Generated for ID:"+request.getId());

            }

//call status and set status
    } catch (SQLException e) {
        response.setResponseCode(400).setResponseMessage("DB ERROR");

    }catch (Exception e){
            response.setResponseCode(400).setResponseMessage("ERROR");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateTicket(Ticket.ticketcreatepayload request, StreamObserver<Ticket.id> responseObserver) {
        Ticket.id.Builder ticket = Ticket.id.newBuilder();

        try {
            //check if ticekt exist or not with this id
            if(!(new YantraDButil().getTicketDetailById(request.getId())).next()){
                ticket.setResponseCode(200).setResponseMessage("No Ticket with this booking");
                responseObserver.onNext(ticket.build());
                responseObserver.onCompleted();
                return;
            }
            //validating user inputs
            if (!(new TicketValidator().ticketUpdateCreateFieldValidator(request).equals("SUCCESS"))) {
                ticket.setResponseCode(200).setResponseMessage(new TicketValidator().ticketUpdateCreateFieldValidator(request));
                responseObserver.onNext(ticket.build());
                responseObserver.onCompleted();
                return;
            }
            new YantraDButil().updateTicket(request);
            ticket.setResponseMessage("SUCCESS").setId(request.getId()).setResponseCode(200);

            ResultSet rs = new YantraDButil().getBookingDetailById(request.getId());
            if(rs.next()){
                new ClientCalls().sendEmail(rs.getString("email"),"Ticket Updated for ID:"+request.getId());

            }

        } catch (SQLException e) {
            ticket.setResponseMessage("DB ERROR").setResponseCode(400);
        }catch (Exception e){
            ticket.setResponseCode(400).setResponseMessage("ERROR");
        }
        responseObserver.onNext(ticket.build());
        responseObserver.onCompleted();
    }


}
