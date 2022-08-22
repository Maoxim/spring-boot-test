package org.hotswap.agent.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
public class HotswapSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(HotswapSpringBoot.class, args);
	}
}
