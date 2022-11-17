package DButility;

import com.yantragenie.bookings.Booking;
import com.yantragenie.ticket.Ticket;
import com.yantragenie.userdetail.UserService;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.UUID;

public class YantraDButil {
    private  final String url ="jdbc:postgresql://localhost:5432/postgres";
    private final String username = "postgres";
    private  final String password ="test123";




    public YantraDButil() throws SQLException {
    }



    public ResultSet getBookingDetailById(String id) throws SQLException {
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
         Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from bookingdetails where id ='"+id+"'");
        conn.close();
        return rs;
        }


    public String createNewBooking(Booking.bookingCreate request, UserService.Response2 userdetail) throws SQLException {
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        //change when servic and user com

        StringBuilder query = new StringBuilder("Insert into bookingdetails (id,firstName,lastname,email,mobilenumber,bookingdate,preferredlocation,device,servicedevicebrand,userid,serviceproviderid,issuedesc,timeslot,preferredday,updatedon,slotendtime)");
        query.append(" values ('").append(UUID.randomUUID().toString()).append("','");
        query.append(userdetail.getFirstName()).append("','");
        query.append(userdetail.getLastName()).append("','");
        query.append(userdetail.getEmail()).append("','");
        query.append(userdetail.getContactNo()).append("','");
        query.append(LocalDate.now(ZoneId.of("Asia/Kolkata"))).append("','");
        query.append(request.getPrefferdServiceLocation()).append("','");
        query.append(request.getDevice()).append("','");
        query.append(request.getServiceDeviceBrand()).append("','");
        query.append(Integer.parseInt(request.getUserid())).append("','");
        query.append(request.getServiceproviderid()).append("','");
        query.append(request.getIssueDescription()).append("','");
        query.append(request.getPreferredTimeSlot()).append("','");
        query.append(request.getPreferredDaySlot()).append("','");
        query.append(LocalDateTime.now(ZoneId.of("Asia/Kolkata"))).append("','");
        query.append(LocalTime.parse(request.getPreferredTimeSlot()).plusMinutes(30)).append("')");
        query.append(" returning id");
        ResultSet rs = stmt.executeQuery(query.toString());
        rs.next();
        conn.close();
        return rs.getString(1);
    }


    public ResultSet getBookingDetailsFromUserId(String id) throws SQLException {
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from bookingdetails where userid = '"+id+"'");
        conn.close();
        return rs;
    }

    public ResultSet getBookingDetailsFromServiceProviderId(String id) throws SQLException{
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from bookingdetails where serviceproviderid = '"+id+"'");
        conn.close();
        return rs;
    }


    public ResultSet runGeneralQuery(String query) throws SQLException{
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        conn.close();
        return rs;
    }

    public String updateBooking(Booking.bookingupdatepayload request) throws SQLException {
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        StringBuilder sb = new StringBuilder("update bookingdetails set ");
        sb.append("preferredlocation = '"+request.getLocation()+"',");
        sb.append("device = '"+request.getDevice()+"',");
        sb.append("servicedevicebrand ='"+request.getBrand()+"',");
        sb.append("issuedesc ='"+request.getIssuedesc()+"',");
        sb.append("timeslot ='"+request.getTimeslot()+"',");
        sb.append("slotendtime = '"+LocalTime.parse(request.getTimeslot()).plusMinutes(30)+"',");
        sb.append("preferredday ='"+request.getDayslot()+"',");
        sb.append("updatedon ='"+LocalDateTime.now(ZoneId.of("Asia/Kolkata"))+"'");
        sb.append(" where id ='"+request.getBookingid()+"' returning id");
        ResultSet rs = stmt.executeQuery(sb.toString());
        rs.next();
        conn.close();
        return rs.getString(1);

    }

    //****************************DB UTILITY FOR TICKET BELOW**************************n
    public ResultSet getTicketDetailById(String id) throws SQLException {
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from ticketdetails where bookingid ='"+id+"'");
        conn.close();
        return rs;
    }


    public void createNewTicket(Ticket.ticketcreatepayload request, ResultSet rs) throws SQLException {

        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        rs.next();
        StringBuilder sb = new StringBuilder("Insert into ticketdetails (bookingid,preferredlocation,device,servicedevicebrand,userid,serviceproviderid,issuedesc,ticketgenerationdate,updatedon,technicianname,techniciancontactnumber,estimatedservicedays) values ('");
        sb.append(rs.getString("id")).append("','");
        sb.append(rs.getString("preferredlocation")).append("','");
        sb.append(rs.getString("device")).append("','");
        sb.append(rs.getString("servicedevicebrand")).append("','");
        sb.append(rs.getString("userid")).append("','");
        sb.append(rs.getString("serviceproviderid")).append("','");
        sb.append(request.getIssuedesc()).append("','");
        sb.append(LocalDate.now(ZoneId.of("Asia/Kolkata"))).append("','");
        sb.append(LocalDateTime.now(ZoneId.of("Asia/Kolkata"))).append("','");
        sb.append(request.getTechnicianname()).append("','");
        sb.append(request.getTechnicialcontactnumber()).append("','");
        sb.append(request.getEstimatedservicedays()).append("')");
        stmt.execute(sb.toString());
        conn.close();
    }



    public void updateTicket(Ticket.ticketcreatepayload request) throws SQLException {
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        stmt.execute("update ticketdetails set techniciancontactnumber = '"+request.getTechnicialcontactnumber()+"',technicianname ='"+request.getTechnicianname()+"' ,estimatedservicedays ='"+request.getEstimatedservicedays()+"' ,issuedesc ='"+request.getIssuedesc()+"' where bookingid ='"+request.getId()+"'");
        conn.close();
    }


    public String getServiceProviderId(String bookingid) throws SQLException{
        Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select serviceproviderid from bookingdetails where id='"+bookingid+"'");
        conn.close();
        while (rs.next()){
            return rs.getString(1);
        }
        return "ERROR";
    }


}

