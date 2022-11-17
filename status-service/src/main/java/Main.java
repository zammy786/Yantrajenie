import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.StatusServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting a Bookings GRPC server!!!");
        Server server = ServerBuilder.forPort(7001).addService(new StatusServer()).build();
        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();
    }
}
