package com.yogishdev.JaegerTracing.workers;


import io.camunda.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DbPersistWorker {
    final static Logger logger = LoggerFactory.getLogger(DbPersistWorker.class);




    @JobWorker(type = "db-persist-worker")
    public void dbPersist(){
        logger.info("db persist worker triggered");
    }
}
