import com.yantrajenie.grpc.User;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author Priyanshu.Singh
 */
public class userServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting Server");
        Server server = ServerBuilder.forPort(8085).addService(new User()).build();
        server.start();
        System.out.println("Server start at port no : " + server.getPort());
        server.awaitTermination();
    }
}
