package com.yogishdev.camunda8.p4.springboot.workers;


import com.yogishdev.camunda8.p4.springboot.model.PaymentGatewayResponseInfo;
import io.camunda.client.annotation.JobWorker;
import io.camunda.client.annotation.Variable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentGatewayWorker {



    @JobWorker(type = "payment-gateway-worker")
    public Map<String, PaymentGatewayResponseInfo> msgValidator(@Variable double amount, @Variable(name = "user_email") String email){


        PaymentGatewayResponseInfo paymentGatewayResponseInfo = new PaymentGatewayResponseInfo();

        paymentGatewayResponseInfo.setResponseCode(200);
        paymentGatewayResponseInfo.setResponseMessage("gateway processed transaction successfully");
        paymentGatewayResponseInfo.setStatus("SUCCESS");

        return  Map.of("paymentGatewayResponseInfo", paymentGatewayResponseInfo) ;

    }
}
