package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.controller;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.dto.CustomerV1DTO;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.dto.CustomerV2DTO;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.Customer;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

    @RestController
    @RequestMapping("/customers")
    public class CustomerVersioningController {

        private final CustomerService service;

        public CustomerVersioningController(CustomerService service) {
            this.service = service;
        }

        @GetMapping("/v1")
        public List<CustomerV1DTO> getCustomersV1() {
            return service.getAllCustomers()
                    .stream()
                    .map(customer -> new CustomerV1DTO(
                            customer.getId(),
                            customer.getName()))
                    .collect(Collectors.toList());
        }

        @GetMapping("/v2")
        public List<CustomerV2DTO> getCustomersV2() {
            return service.getAllCustomers()
                    .stream()
                    .map(customer -> new CustomerV2DTO(
                            customer.getId(),
                            customer.getName(),
                            customer.getEmail(),
                            customer.getAddress(),
                            customer.getPhone()))
                    .collect(Collectors.toList());
        }

        @GetMapping(params = "version=1")
        public List<CustomerV1DTO> getCustomersParamV1() {
            return getCustomersV1();
        }

        @GetMapping(params = "version=2")
        public List<CustomerV2DTO> getCustomersParamV2() {
            return getCustomersV2();
        }

        @GetMapping(headers = "X-API-VERSION=1")
        public List<CustomerV1DTO> getCustomersHeaderV1() {
            return getCustomersV1();
        }

        @GetMapping(headers = "X-API-VERSION=2")
        public List<CustomerV2DTO> getCustomersHeaderV2() {
            return getCustomersV2();
        }

        @GetMapping(produces = "application/vnd.company.app-v1+json")
        public List<CustomerV1DTO> getCustomersMimeV1() {
            return getCustomersV1();
        }

        @GetMapping(produces = "application/vnd.company.app-v2+json")
        public List<CustomerV2DTO> getCustomersMimeV2() {
            return getCustomersV2();
        }
    }
