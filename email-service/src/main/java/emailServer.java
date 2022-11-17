import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.EmailService;

import java.io.IOException;

//import static org.example.EmailService.jdbc;

//import static org.example.EmailService.jdbc;

/**
 * @author Priyanshu.Singh
 */
public class emailServer {
    public static void main(String[] args) throws IOException, InterruptedException
    {

//        jdbc();
        Server server = ServerBuilder.forPort(8079).addService(new EmailService()).build();
        server.start();
        System.out.println("SERVER STARTED");
        server.awaitTermination();



    }
}
