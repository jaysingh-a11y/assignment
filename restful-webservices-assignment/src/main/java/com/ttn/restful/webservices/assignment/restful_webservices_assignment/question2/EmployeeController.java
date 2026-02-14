package com.ttn.restful.webservices.assignment.restful_webservices_assignment.question2;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {
//    @Autowired
    private EmployeeDaoService service;

     public EmployeeController(EmployeeDaoService service){
         this.service=service;
     }

     @GetMapping("/users")
    public List<Employee> getAllEmployee(){
         return service.retrieveAllEmployee();
     }

    @GetMapping("/users/{id}")
    public Employee getEmployee(@PathVariable int id){

           Employee e =service.getById(id);
           if(e==null){
               throw new UserNotFoundException("id:"+id);
           }
           return e;
    }

    @PostMapping("/users/add")
    public Employee addEmployee1(@RequestBody @Valid Employee e){
         service.addEmployee(e);
         return e;
    }

    @PostMapping("/users")
    public ResponseEntity<Employee> addEmployee(@RequestBody @Valid Employee e){
         Employee addedEmployee =service.addEmployee(e);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(addedEmployee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/update/{id}")
    public Employee updateEmp(@RequestBody @Valid Employee e,
                              @PathVariable int id){
         return service.updateEmployee(e,id);
    }


    @DeleteMapping("/users/{id}")
    public String deleteEmployee(@PathVariable int id){
        service.removeEmployee(id);
        return "user deleted";
    }
}
