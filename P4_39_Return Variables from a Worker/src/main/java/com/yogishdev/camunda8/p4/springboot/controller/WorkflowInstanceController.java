package com.yogishdev.camunda8.p4.springboot.controller;


import com.yogishdev.camunda8.p4.springboot.service.StartInstanceService;
import io.camunda.client.api.response.ProcessInstanceEvent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkflowInstanceController {

    final StartInstanceService startInstanceService;

    public WorkflowInstanceController(StartInstanceService startInstanceService) {
        this.startInstanceService = startInstanceService;
    }

    @PostMapping("/start")
    public String deploy(@RequestBody String processId) {
        startInstanceService.start(processId);
        return processId + " started";
    }


    @PostMapping("/start/{processId}")
    public ProcessInstanceEvent start(@PathVariable("processId") String processId,
                                      @RequestBody String jsonVarsString) {
       return startInstanceService.start(processId, jsonVarsString);
    }
}
