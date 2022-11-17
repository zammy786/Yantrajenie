package Validators.Tickets;

import DButility.YantraDButil;
import Services.Booking.Enums.ServiceLocation;
import com.yantragenie.ticket.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketValidator {

    public String ticketUpdateCreateFieldValidator(Ticket.ticketcreatepayload request) throws SQLException {

        //fetching booking details to see if booking is for home or remote
        ResultSet rs = new YantraDButil().getBookingDetailById(request.getId());
        while(rs.next()){
            if(rs.getString("preferredlocation").equals(ServiceLocation.HOME.name())){
                if(request.getTechnicianname().equals("") || request.getTechnicialcontactnumber().equals("")){
                    return "PLEASE ENTER TECHNICIAN DETAIL";
                }
            }
            if(rs.getString("preferredlocation").equals(ServiceLocation.SERVICE_CENTRE.name())){
                if(request.getEstimatedservicedays().equals("")){
                    return "Please Enter Estimated Sevicing days";
                }

            }
        }



        return "SUCCESS";
    }
}
