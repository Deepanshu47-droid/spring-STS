package com.bridgelabz.different_rest_api_calls;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloPutController {

    // UC5: PUT Request with Path Variable and Query Parameter
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}

