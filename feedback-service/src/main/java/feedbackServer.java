import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.ValidateServiceProvider;
import service.ValidateUser;
import service.userFeedbackService;
import java.io.IOException;
/**
 * @author Priyanshu.Singh
 */
public class feedbackServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8082).addService(new userFeedbackService()).addService(new ValidateUser()).addService(new ValidateServiceProvider()).build();
        server.start();
        System.out.println("server started with port no. "+server.getPort());
        server.awaitTermination();

    }
}
