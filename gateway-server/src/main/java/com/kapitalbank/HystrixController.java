package com.kapitalbank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fb")
public class HystrixController {

    @GetMapping("/account")
    public String accountFallback(){
        return "Account Service is not available.";
    }

    @GetMapping("/ticket")
    public String ticketFallback(){
        return "Ticket Service is not available.";
    }

    @GetMapping("/user")
    public String userFallback(){
        return "User Service is not available.";
    }
}
