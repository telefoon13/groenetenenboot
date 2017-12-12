package be.vdab.groenetenenboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class GroenetenenbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroenetenenbootApplication.class, args);
	}
}
