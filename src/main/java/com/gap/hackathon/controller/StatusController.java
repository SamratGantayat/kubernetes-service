package com.gap.hackathon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/k8")
public class StatusController {

    @GetMapping("/getTime")
    public LocalDateTime getDateTime(){
         return LocalDateTime.now();
    }

}
