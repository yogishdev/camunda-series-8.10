package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.model.User;
import io.camunda.client.annotation.JobWorker;
import io.camunda.client.annotation.Variable;
import io.camunda.client.annotation.VariablesAsType;
import io.camunda.client.api.response.ActivatedJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WorkersService {
    final static Logger logger  = LoggerFactory.getLogger(WorkersService.class);



//    @JobWorker(type = "my-first-test-worker", name = "My First Worker")
//    public void myFirstTestWorker(final ActivatedJob job){
//        Map<String, Object>  varsmap = job.getVariablesAsMap();
//        logger.info("[my-first-test-worker] triggered with  variables : {} ",varsmap);
//        //logger.info("[my-first-test-worker] triggered with order id : {}", orderId );
//    }

//    @JobWorker(type = "my-first-test-worker", name = "My First Worker")
//    public void myFirstTestWorker(@VariablesAsType User user){
//
//        logger.info("[my-first-test-worker] triggered with  variables : {} ",user);
//        //logger.info("[my-first-test-worker] triggered with order id : {}", orderId );
//    }


    @JobWorker(type = "my-first-test-worker", name = "My First Worker")
    public void myFirstTestWorker(final ActivatedJob job) throws JsonProcessingException {
       logger.info("my-first-test-worker triggered for instance id : {}", job.getProcessInstanceKey());

      String jsonVarsString  =new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(job.getVariablesAsMap());

        logger.info("[my-first-test-worker] triggered with  variables :\n {} ",jsonVarsString);
        //logger.info("[my-first-test-worker] triggered with order id : {}", orderId );
    }

    @JobWorker(type = "goodbye-worker")
    public void goodbyeWorker(){
        logger.info("GOODBYE from Good Bye Worker");
    }
}
