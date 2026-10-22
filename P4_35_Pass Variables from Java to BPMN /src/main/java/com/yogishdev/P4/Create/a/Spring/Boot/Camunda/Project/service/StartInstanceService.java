package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.service;


import io.camunda.client.CamundaClient;
import io.camunda.client.api.response.ProcessInstanceEvent;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Service
public class StartInstanceService {

    final static Logger logger = LoggerFactory.getLogger(StartInstanceService.class);

    final CamundaClient client;

    public StartInstanceService(CamundaClient client) {
        this.client = client;
    }


//    @PostConstruct
//    public void start12(){
//        client.newCreateInstanceCommand()
//                .bpmnProcessId("STARTING_INSTANCE_FROM_CODE_1")
//                .latestVersion()
//                .execute();
//    }


    @PostConstruct
    public void start12() {


        HashMap<String, Object> vars = new HashMap<>();
        vars.put("country", "INDIA");
        vars.put("MyChannelName", "YogishDev");


        ProcessInstanceEvent event = client.newCreateInstanceCommand()
                .bpmnProcessId("STARTING_INSTANCE_FROM_CODE_1")
                .latestVersion()
                .variables(vars)
                .execute();

        logger.info("strated instance with even data : {}",event);

    }

    public void start(String processId) {
        client.newCreateInstanceCommand()
                .bpmnProcessId(processId)
                .latestVersion()
                .execute();
    }


    public ProcessInstanceEvent start(String processId, String jsonVarsString){
        ProcessInstanceEvent event = client.newCreateInstanceCommand()
                .bpmnProcessId(processId)
                .latestVersion()
                .variables(jsonVarsString)
                .execute();

        logger.info("strated instance with even data : {}",event);
        return event;
    }
}
