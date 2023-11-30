package com.camunda.example.camundademo;

import io.camunda.zeebe.client.ZeebeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    ZeebeClient client;


    public String onBoard() {
        client.newActivateJobsCommand().jobType("test");
        return "Success";
    }
}
