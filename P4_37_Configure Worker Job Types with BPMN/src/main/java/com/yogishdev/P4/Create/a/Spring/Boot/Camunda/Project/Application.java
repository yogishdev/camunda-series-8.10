package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project;

import io.camunda.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Deployment(resources = "classpath:DEPLOYING_FROM_RESOURCEDS_VIA_SB_1234.bpmn")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
