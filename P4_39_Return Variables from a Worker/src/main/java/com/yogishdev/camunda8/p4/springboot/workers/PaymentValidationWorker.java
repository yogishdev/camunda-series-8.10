package com.yogishdev.camunda8.p4.springboot.workers;


import com.google.errorprone.annotations.Var;
import io.camunda.client.annotation.JobWorker;
import io.camunda.client.annotation.Variable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PaymentValidationWorker {



    @JobWorker(type = "payment-msg-validator")
    public Map<String, Object> msgValidator(@Variable double amount, @Variable(name = "user_email") String email){

        String status = null;
        List<String> errors = new ArrayList<>();

        if (amount <= 0.0){
            status = "NOT_VALID";
            errors.add("amount is less than or equals to 0.0. shoulb= be more than 0.0");
        }

        if (email == null || email.trim().isBlank() || !email.contains("@")){
            status = "NOT_VALID";
            errors.add("email is null or blank or doesnt contain @");
        }

        if (status == null){
            status = "VALID";
        }

        Map<String, Object>  msgValidatorInfo = new HashMap<>();

        msgValidatorInfo.put("validatorStatus", status);
        msgValidatorInfo.put("validationErrors", errors);
        return  Map.of("paymentValidatorInfo", msgValidatorInfo) ;


    }
}
