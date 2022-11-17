import com.stackroute.grpc.server.SearchService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Priyanshu.Singh
 */
public class searchServer {
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {

        Server server= ServerBuilder.forPort(8085).addService(new SearchService()).build();
        server.start();
        System.out.println("Server started on port number "+server.getPort());
        server.awaitTermination();
    }
}
