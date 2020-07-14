package com.sudhir.registration;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "profile")
public class ProfileController {

    @GetMapping
    public String getProfile(){
        return "Hello World";
    }
}
