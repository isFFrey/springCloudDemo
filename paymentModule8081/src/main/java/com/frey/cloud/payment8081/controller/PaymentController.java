package com.frey.cloud.payment8081.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("payment")
    public String payment() {
        return "success";
    }
}
