import com.yantrajenie.authentication.services.RegistrationService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author Priyanshu.Singh
 */
public class authenticationServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Inside the authentication server");

        Server server = ServerBuilder.forPort(8095).addService(new RegistrationService()).build();
        server.start();
        System.out.println("Server started at port: "+server.getPort());
        server.awaitTermination();


    }
}
