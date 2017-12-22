package info.icoresys.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IcoreEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcoreEurekaServerApplication.class, args);
	}
}
