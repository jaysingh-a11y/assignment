package com.ttn.security.applicationsecurity.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}