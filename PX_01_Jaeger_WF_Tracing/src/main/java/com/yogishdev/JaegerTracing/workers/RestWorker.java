package com.yogishdev.JaegerTracing.workers;

import io.camunda.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class RestWorker {

    final static Logger logger = LoggerFactory.getLogger(DbPersistWorker.class);




    @JobWorker(type = "rest-worker")
    public void restWorker(){
        logger.info("rest worker triggered");
    }
}
