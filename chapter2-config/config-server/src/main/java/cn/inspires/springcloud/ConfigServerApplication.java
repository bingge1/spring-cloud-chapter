package cn.inspires.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Cloud Config服务端程序
 * @author jon
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
