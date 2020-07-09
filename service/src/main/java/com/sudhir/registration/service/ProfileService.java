package com.sudhir.registration.service;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public String getProfile(){
        return "Dummy User from profile";
    }

}