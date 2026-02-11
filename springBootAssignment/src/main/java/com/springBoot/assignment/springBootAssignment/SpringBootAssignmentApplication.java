package com.springBoot.assignment.springBootAssignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringBootAssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootAssignmentApplication.class, args);

		Environment env= context.getBean(Environment.class);

		//Reading the environment variables defined for question2
		String name = env.getProperty("app.name");
		String environment = env.getProperty("app.environment");
		String version = env.getProperty("app.version");
		String version1 = env.getProperty("jay");
		System.out.println(version1);

		String employee_max_count = env.getProperty("app.employee.max.count");
		System.out.println("Name of project is:"+name);
		System.out.println(environment);
		System.out.println(version);
		System.out.println(employee_max_count);
	}

}
