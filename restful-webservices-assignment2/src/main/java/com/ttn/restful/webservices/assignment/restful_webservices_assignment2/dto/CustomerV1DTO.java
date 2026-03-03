package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.dto;

    public class CustomerV1DTO {

        private Long id;
        private String name;

        public CustomerV1DTO(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

