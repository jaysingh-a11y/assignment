package com.ttn.restful.webservices.assignment.restful_webservices_assignment.question1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greet")
    public String greetMethod(){
        return "-------------------Hello World-------------------";
    }

}
