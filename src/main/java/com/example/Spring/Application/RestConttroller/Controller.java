package com.example.Spring.Application.RestConttroller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/java1")
    public String javaEndPoints(){
        return "this is first end point";
    }

    @GetMapping("/java2")
    public String javaEndPoints2(){
        return "This is second end point";
    }
    @GetMapping("/java3")
    public String javaEndPoints3(){
        return "This is second end point";
    }
    @GetMapping("/java4")
    public String javaEndPoints4(){
        return "This is second end point";
    }
}
