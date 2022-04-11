package com.frey.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("order")
    public String order() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8082/payment", String.class);
        if (forEntity.getBody().equals("success")) {
            return "success to take an order!";
        } else {
            return "fail to take an order!";
        }
    }
}
