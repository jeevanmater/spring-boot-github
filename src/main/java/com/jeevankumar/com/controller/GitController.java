package com.jeevankumar.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/git")
public class GitController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Git hube.....Which is Good flatform for commit the code changes..";
    }
}
