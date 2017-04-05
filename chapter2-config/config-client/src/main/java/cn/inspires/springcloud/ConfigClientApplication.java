package cn.inspires.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;

@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class ConfigClientApplication {
	@Value("author.chinese")
	String author;
	Environment env;
	@Autowired
	void setEnvironment(Environment env) {
		this.env = env;
		System.out.println("my-config.appName from env: " + env.getProperty("domain"));
		System.out.println("author chinese name is " + author);
	} 
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
