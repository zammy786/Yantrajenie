import Services.Booking.BookingService;
import Services.Tickets.TicketsService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author Priyanshu.Singh
 */
public class bookingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9001).addService(new BookingService()).addService(new TicketsService()).build();
        server.start();
        System.out.println("Booking service started on port 9001");

        System.out.println("Ticket service started on port 9001");

        server.awaitTermination();
    }
}
