package com.Trial.TestTrialEx.Service;

import com.Trial2.TesterTrail.Domain.TestClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    RestTemplate template;

    @Override
    public com.Trial2.TesterTrail.Domain.TestClass updateTest(com.Trial2.TesterTrail.Domain.TestClass testClass) {
        com.Trial2.TesterTrail.Domain.TestClass testClass1= new TestClass();
        if(!String.valueOf(testClass.getAge()).isEmpty() && !String.valueOf(testClass.getAge()).isBlank()){
        if(testClass.getAge() > 18){
            testClass1.setNickName(testClass.getNickName());
            testClass1.setTestId(testClass.getTestId());
            testClass1.setAge(testClass.getAge());
        }else{
            testClass1.setNickName("Not Allowed");
            testClass1.setTestId(testClass.getTestId());
            testClass1.setAge(testClass.getAge());
        }
        }else {
            return new com.Trial2.TesterTrail.Domain.TestClass(testClass.getTestId(),"",0);
        }
        return testClass1;
    }

    @KafkaListener(topics = "orders", groupId = "inventory-service")
    public void consume(com.Trial2.TesterTrail.Domain.TestClass message) {
        System.out.println("Received message: " + message);
            TestClass testClass = updateTest(message);
        TestClass testClass1 = template.postForObject("http://tester-trial/test/api/v1/add", testClass, TestClass.class);

        // Add logic to process the message (e.g., update inventory)
    }
}
