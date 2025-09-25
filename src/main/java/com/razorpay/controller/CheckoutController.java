package com.razorpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckoutController {
    // http://localhost:8080/payment
    @GetMapping("/payment")
    public String showPaymentPage(){
        return "payment-request";
    }
}
