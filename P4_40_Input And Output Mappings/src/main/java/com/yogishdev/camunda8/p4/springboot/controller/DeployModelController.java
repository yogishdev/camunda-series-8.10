package com.yogishdev.camunda8.p4.springboot.controller;


import io.camunda.client.CamundaClient;
import io.camunda.client.api.response.DeploymentEvent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

@RestController
public class DeployModelController {

    final CamundaClient client;

    public DeployModelController(CamundaClient client){
        this.client = client;
    }

    @PostMapping("/model")
    public String deploy(@RequestBody String bpmnXml){
        final DeploymentEvent deploymentEvent = client.newDeployResourceCommand()
                .addResourceString(bpmnXml, Charset.defaultCharset(),"dummy.bpmn")
                .execute();

        return deploymentEvent.toString();
    }
}
