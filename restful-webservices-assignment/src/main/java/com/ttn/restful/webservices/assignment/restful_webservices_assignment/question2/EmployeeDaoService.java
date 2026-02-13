package com.ttn.restful.webservices.assignment.restful_webservices_assignment.question2;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDaoService {
    public static int count=0;

    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(++count, "Swapnil", LocalDate.now().minusYears(40)));
        employeeList.add(new Employee(++count, "Priyanshu", LocalDate.now().minusYears(23)));
        employeeList.add(new Employee(++count, "Megha", LocalDate.now().minusYears(30)));
        employeeList.add(new Employee(++count, "Jay", LocalDate.now().minusYears(22)));
    }

    public List<Employee> retrieveAllEmployee(){
        return employeeList;
    }

//    public Employee getById(int id){
//        return employeeList.stream()
//                .filter(emp->emp.getId()==id)
//                .findFirst()
//                .get();
//    }

    public Employee getById(int id){
        return employeeList.stream()
                .filter(emp->emp.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public void addEmp(Employee e){
        e.setId(++count);
        employeeList.add(e);
    }

    public Employee addEmployee(Employee e) {
        e.setId(++count);
        employeeList.add(e);
        return e;
    }

    public Employee updateEmployee(int id,Employee e ) {
        Employee newEmp = getById(id);
        newEmp.setName(e.getName());
        newEmp.setAge(e.getAge());
        return newEmp;
    }

    public void removeEmployee(int id) {
        employeeList.remove(employeeList.stream().filter(emp->emp.getId()==id).findFirst().get());

    }
}
