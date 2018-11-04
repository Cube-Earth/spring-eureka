package earth.cube.tools.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistry {

	public static void main(String [] saArgs) {
		SpringApplication.run(ServiceRegistry.class, saArgs);
	}

}
