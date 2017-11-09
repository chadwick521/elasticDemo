package com.zhaoyh.elasticdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ElasticdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticdemoApplication.class, args);
	}

}
