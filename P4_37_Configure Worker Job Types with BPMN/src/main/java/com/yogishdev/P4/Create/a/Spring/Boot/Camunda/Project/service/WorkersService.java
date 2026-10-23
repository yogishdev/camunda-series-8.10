package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.service;


import io.camunda.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WorkersService {
    final static Logger logger  = LoggerFactory.getLogger(WorkersService.class);



    @JobWorker(type = "my-first-test-worker", name = "My First Worker")
    public void myFirstTestWorker(){
        logger.info("[my-first-test-worker] triggered ");
    }

    @JobWorker(type = "goodbye-worker")
    public void goodbyeWorker(){
        logger.info("GOODBYE from Good Bye Worker");
    }
}
