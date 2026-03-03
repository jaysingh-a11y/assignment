package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    @Service
    public class CustomerService {

        private static final List<Customer> customerList = new ArrayList<>();

        static {
            customerList.add(new Customer(1L, "Jay", "jay@gmail.com", "Delhi", "9999999999"));
            customerList.add(new Customer(2L, "Amit", "amit@gmail.com", "Noida", "8888888888"));
        }

        public List<Customer> getAllCustomers() {
            return customerList;
        }
    }
