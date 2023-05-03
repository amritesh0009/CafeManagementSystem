package com.in.cafe.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {
    ResponseEntity<String> signup(Map<String, String> requestMap);
    ResponseEntity<String> Login(Map<String, String> requestMap);
}
