package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project;

import io.camunda.client.CamundaClient;
import io.camunda.client.api.response.ProcessInstanceEvent;
import io.netty.handler.codec.http.cookie.Cookie;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class ConnectivityTestService {


    private final  CamundaClient client;


    public ConnectivityTestService(CamundaClient client){
        this.client = client;
    }

//    @PostConstruct
//    public void trigger(){
//        final ProcessInstanceEvent processInstanceEvent = client.newCreateInstanceCommand()
//                .bpmnProcessId("CONNECT_TEST")
//                .latestVersion()
//                .variables(Map.of("orderId", "12345", "amount", 100.0))
//                .execute();
//    }


}
