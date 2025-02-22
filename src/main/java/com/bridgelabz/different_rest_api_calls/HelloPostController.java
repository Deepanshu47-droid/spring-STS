package com.bridgelabz.different_rest_api_calls;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloPostController {

    @PostMapping("/post")  // Ensure this is @PostMapping (not @GetMapping)
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";

//        Below is the testing format on post man
//        http://localhost:8080/hello/post
//
//        raw data
//        {
//            "firstName": "Deepanshu",
//                "lastName": "Malviya"
//        }

    }
}

