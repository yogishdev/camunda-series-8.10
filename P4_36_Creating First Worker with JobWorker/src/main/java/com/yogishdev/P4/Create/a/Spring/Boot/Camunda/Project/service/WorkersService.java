package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.service;


import io.camunda.client.annotation.JobWorker;
import org.springframework.stereotype.Service;

@Service
public class WorkersService {




    @JobWorker(type = "my-first-test-worker", name = "My First Worker")
    public void myFirstTestWorker(){

    }
}
