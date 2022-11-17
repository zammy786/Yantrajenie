package service;

import model.StatusModel;
import service.ienums.BookingStatus;
import service.ienums.TicketStatus;

import javax.xml.transform.Result;
import java.sql.*;

public class DatabaseService {

    public Connection getConnection() throws ClassNotFoundException, SQLException { // to connect with database so i created getconnection() method
        Connection c;
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/bookings",
                        "postgres", "postgres");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        return c;
    }

    public StatusModel getBookingStatusForId(String id) throws SQLException, ClassNotFoundException {
        Connection c = getConnection();
        String query = "select booking_id, booking_status,ticket_status from public.status where booking_id = ?;";

        PreparedStatement statement = c.prepareStatement(query);
        statement.setString(1, id);
        ResultSet rs = statement.executeQuery();

        StatusModel statusModel = new StatusModel();
        statusModel.setBooking_id("EMPTY");


        if (rs.next()) { // start with -1, 0, 1 .....so on
            statusModel.setBooking_id(rs.getString(1));  // adding value to the  parameter of statusModel
            statusModel.setBooking_status(rs.getString(2));
            statusModel.setTicket_status(rs.getString(3));
        }

        return statusModel;
    }

    public StatusModel updateBookingStatus(String id, String status) throws SQLException, ClassNotFoundException {
        StatusModel model = getBookingStatusForId(id);


        if (model.getBooking_id().equals("EMPTY")) {
            return model;

        } else {

            Connection c = getConnection();
            String query = "UPDATE public.\"status\"\n" +
                    "\tSET booking_status=?\n" +
                    "\tWHERE booking_id =?;";
            PreparedStatement statement = c.prepareStatement(query);
            statement.setString(1, status);
            statement.setString(2, id);
            statement.executeUpdate();
            c.commit();
            return getBookingStatusForId(id);

        }

    }

    public StatusModel updateTicketStatus(String id, String status) throws SQLException, ClassNotFoundException {
        StatusModel model = getBookingStatusForId(id);
        if (model.getBooking_id().equals("EMPTY")) {
            return model;

        } else {
            Connection c = getConnection();
            String query = "UPDATE public.\"status\"\n" +
                    "\tSET ticket_status=?\n" +
                    "\tWHERE booking_id =?;";
            PreparedStatement statement = c.prepareStatement(query);
            statement.setString(1, status);
            statement.setString(2, id);
            statement.executeUpdate();
            c.commit();
            if(status.equals(TicketStatus.COMPLETED.name())){
                updateBookingStatus(id, BookingStatus.TICKET_COMPLETED.name());
            }
            if(status.equals(TicketStatus.GENERATED.name())){
                updateBookingStatus(id,BookingStatus.TICKET_GENERATED.name());
            }
            return getBookingStatusForId(id);

        }

    }

    public StatusModel insertNewBooking(String id, String email) throws SQLException, ClassNotFoundException {
        Connection c = getConnection();
        String query = "INSERT INTO public.status(\n" +
                "\tbooking_id, booking_status, ticket_status, email)\n" +
                "\tVALUES (?, ?, ?, ?);";
        PreparedStatement statement = c.prepareStatement(query);
        statement.setString(1,id);
        statement.setString(2, BookingStatus.CONFIRMED.name());
        statement.setString(3, TicketStatus.NOT_GENERATED.name());

        statement.setString(4,email);
        statement.executeUpdate();
        c.commit();
        return getBookingStatusForId(id);
    }


    public String getbookingEmail(String id) throws SQLException, ClassNotFoundException {
        Connection c = getConnection();
        String query = "select email from status where bookingid ='"+id+"'";
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);
        if(rs.next()){
            return rs.getString(1);
        }
        return "No email";
    }
}
