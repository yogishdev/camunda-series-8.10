package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project;


import io.camunda.client.CamundaClient;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class StartInstanceService {



    final CamundaClient client;

    public StartInstanceService(CamundaClient client){
        this.client = client;
    }


//    @PostConstruct
//    public void start12(){
//        client.newCreateInstanceCommand()
//                .bpmnProcessId("STARTING_INSTANCE_FROM_CODE_1")
//                .latestVersion()
//                .execute();
//    }

    public void start(String processId){
        client.newCreateInstanceCommand()
                .bpmnProcessId(processId)
                .latestVersion()
                .execute();
    }
}
