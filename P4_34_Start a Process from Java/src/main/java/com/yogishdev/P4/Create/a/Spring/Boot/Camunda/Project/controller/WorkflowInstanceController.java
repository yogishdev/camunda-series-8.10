package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.controller;


import com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.StartInstanceService;
import io.camunda.client.CamundaClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkflowInstanceController {

    final StartInstanceService startInstanceService;
    public WorkflowInstanceController(StartInstanceService  startInstanceService){
        this.startInstanceService = startInstanceService;
    }

    @PostMapping("/start")
    public String deploy(@RequestBody String processId){
        startInstanceService.start(processId);
        return processId+" started";
    }
}
