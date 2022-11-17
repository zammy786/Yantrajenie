package Validators.Booking;

import CommunicationChannels.ClientCalls;
import DButility.YantraDButil;
import Services.Booking.Enums.ServiceLocation;
import com.yantragenie.bookings.Booking;
import com.yantragenie.spdetail.SpDetails;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingValidators {


    public String fieldValidate(Booking.bookingCreate request) throws Exception{

        if(request.getUserid().equals("")){
            return "User id can't be null";
        }
        if(request.getServiceproviderid().equals("")){
            return "service provider id can not be null";
        }
        if(request.getIssueDescription().equals("")){
            return "Issue description Can not be null";
        }
        if(request.getPreferredDaySlot().equals("") || request.getPreferredTimeSlot().equals("")){
            return "Please choose a Time slot";
        }

        List<String> enumList = new ArrayList<>();
        Arrays.stream(ServiceLocation.values()).forEach(e -> enumList.add(String.valueOf(e)));
        if(!(enumList.contains(request.getPrefferdServiceLocation()))){
            return "INVALID SERVICE LOCATION";
        }

        //fetchingspdetails and verifying if sp serve for this brand and device
        SpDetails.ProfileDetails spDetails = new ClientCalls().getSpDetails(request.getServiceproviderid());
        enumList.clear();
        spDetails.getDeviceListList().forEach(e -> enumList.add(e.toLowerCase()));
        if(!enumList.contains(request.getDevice().toLowerCase())){
            return "We Don't serve For"+request.getDevice();
        }
        enumList.clear();
        spDetails.getBrandsList().forEach(e ->enumList.add(e.toLowerCase()));
        if(!enumList.contains(request.getServiceDeviceBrand().toLowerCase())){
            return "We Don't Serve for this brand";
        }


        return "SUCCESS";
    }


    public String timeSlotCreateValidate(Booking.bookingCreate request) throws Exception {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalTime localTime = LocalTime.parse(request.getPreferredTimeSlot());
        LocalDate localDate = LocalDate.parse(request.getPreferredDaySlot(), formatter);
        SpDetails.ProfileDetails spDetails = new ClientCalls().getSpDetails(request.getServiceproviderid());
        if(localTime.isBefore(LocalTime.parse("09:00")) || localTime.isAfter(LocalTime.parse("18:00"))){
            return "ENTER A VALID TIME";
        }
        if(localDate.isBefore(LocalDate.now())){
            return "ENTER A VALID DATE";


        }else{
            if(localDate.isEqual(LocalDate.now()) && localTime.isBefore(LocalTime.now())){
                return "ENTER A VALID TIME";
            }
        }
        //verifying time
        for (String date:spDetails.getHolidayList()
        ) {

            if(localDate.isEqual(LocalDate.parse(date))){
                return "We Are Closed On This Day";
            }

        }
        //saturday and sunday closed
        if(String.valueOf(localDate.getDayOfWeek()).equals("SUNDAY") || String.valueOf(localDate.getDayOfWeek()).equals("SATURDAY")){
            return "WE ARE CLOSED ON THIS DAY";
        }

        ResultSet rs = new YantraDButil().runGeneralQuery("select * from bookingdetails where (('"+localTime+"' between timeslot and slotendtime - '00:01') or ('"+localTime.plusMinutes(30)+"' between timeslot and slotendtime - '00:01')) and serviceproviderid = '"+request.getServiceproviderid()+"' and preferredday ='"+request.getPreferredDaySlot()+"'");
        int i = 0;
        while(rs.next()) {
            i++;
            if(new ClientCalls().getBookingStauts(rs.getString("id")).equals("CANCELLED")){
                i--;
            }

        }
        if(i == Integer.parseInt(spDetails.getProfileDetails().getCounterAvilable())){
            return "Time Slot Not Available";
        }

        return "SUCCESS";

    }


    public String fValidateUpdate(Booking.bookingupdatepayload request) throws Exception {

        if(request.getBookingid().equals("")){
            return "User id can't be null";
        }

        if(request.getIssuedesc().equals("")){
            return "Issue description Can not be null";
        }
        if(request.getDayslot().equals("") && request.getTimeslot().equals("")){
            return "Please choose a Time slot";
        }
        List<String> enumList = new ArrayList<>();
        Arrays.stream(ServiceLocation.values()).forEach(e -> enumList.add(String.valueOf(e)));
        if(!(enumList.contains(request.getLocation()))) {
            return "INVALID SERVICE LOCATION";
        }

        //fetchingspdetails and verifying if sp serve for this brand and device
        SpDetails.ProfileDetails spDetails = new ClientCalls().getSpDetails(new YantraDButil().getServiceProviderId(request.getBookingid()));
        enumList.clear();
        spDetails.getDeviceListList().forEach(e -> enumList.add(e.toLowerCase()));
        if(!enumList.contains(request.getDevice().toLowerCase())){
            return "We Don't serve For"+request.getDevice();
        }
        enumList.clear();
        spDetails.getBrandsList().forEach(e ->enumList.add(e.toLowerCase()));
        if(!enumList.contains(request.getBrand().toLowerCase())){
            return "We Don't Serve for this brand";
        }
        return "SUCCESS";

    }

    public String timeSlotUpdateValidate(Booking.bookingupdatepayload request) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalTime localTime = LocalTime.parse(request.getTimeslot());
        LocalDate localDate = LocalDate.parse(request.getDayslot(), formatter);
        if(localTime.isBefore(LocalTime.parse("09:00")) || localTime.isAfter(LocalTime.parse("18:00"))){
            return "ENTER A VALID TIME";
        }
        if(localDate.isBefore(LocalDate.now())){
            return "ENTER A VALID DATE";


        }else {
            if(localDate.isEqual(LocalDate.now()) && localTime.isBefore(LocalTime.now())){
                return "ENTER A VALID TIME";
            }
        }
        SpDetails.ProfileDetails spDetails = new ClientCalls().getSpDetails(new YantraDButil().getServiceProviderId(request.getBookingid()));

        //verifying time
        for (String date:spDetails.getHolidayList()
        ) {

            if(localDate.isEqual(LocalDate.parse(date))){
                return "We Are Closed On This Day";
            }

        }

        if(String.valueOf(localDate.getDayOfWeek()).equals("SUNDAY") || String.valueOf(localDate.getDayOfWeek()).equals("SATURDAY")){
            return "WE ARE CLOSED ON THIS DAY";
        }

        ResultSet rsBooking = new YantraDButil().getBookingDetailById(request.getBookingid());
        while (rsBooking.next()){
            if(LocalTime.parse(rsBooking.getString("timeslot")).equals(localTime)){
                return "SUCCESS";

            }
        }

        ResultSet rs = new YantraDButil().runGeneralQuery("select * from bookingdetails where (('"+localTime+"' between timeslot and slotendtime - '00:01') or ('"+localTime.plusMinutes(30)+"' between timeslot and slotendtime - '00:01')) and serviceproviderid = '"+new YantraDButil().getServiceProviderId(request.getBookingid())+"' and preferredday ='"+request.getDayslot()+"'");
        int i = 0;
        while(rs.next()) {
            i++;
            if(new ClientCalls().getBookingStauts(rs.getString("id")).equals("CANCELLED")){
                i--;
            }

        }
        if(i == Integer.parseInt(spDetails.getProfileDetails().getCounterAvilable())){
            return "Time Slot Not Available";
        }



        return "SUCCESS";


    }
}
