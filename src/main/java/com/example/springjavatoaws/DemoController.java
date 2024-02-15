package com.example.springjavatoaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/demo")
    public String GetData(){
        return "Hello World, from AWS ECS and Fargate, integrating with CodePipeline.";
    }
}
