package com.camunda.example.camundademo;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeDeployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
@ZeebeDeployment(resources="classpath:sample.bpmn")
public class CamundaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaDemoApplication.class, args);
	}

}
