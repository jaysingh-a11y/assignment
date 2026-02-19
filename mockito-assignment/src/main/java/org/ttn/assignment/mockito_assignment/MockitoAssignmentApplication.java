package org.ttn.assignment.mockito_assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

@SpringBootApplication
public class MockitoAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockitoAssignmentApplication.class, args);
	}

}
