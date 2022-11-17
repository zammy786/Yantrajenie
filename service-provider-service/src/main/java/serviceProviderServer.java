
import com.yantajenie.serviceProvider.services.SERVICES.ServiceProvider;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class serviceProviderServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting Service Provider Service");

        Server server= ServerBuilder.forPort(8090).addService(new ServiceProvider()).build();

        server.start();
        System.out.println("Server is running on portNo"+server.getPort());
        server.awaitTermination();

    }
}
