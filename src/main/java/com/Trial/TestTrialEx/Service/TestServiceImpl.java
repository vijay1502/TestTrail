package com.Trial.TestTrialEx.Service;

import com.Trial.TestTrialEx.Domain.TestClass;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService{
    @Override
    public TestClass updateTest(TestClass testClass) {
        TestClass testClass1= new TestClass();
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
            return new TestClass(testClass.getTestId(),"",0);
        }
        return testClass1;
    }
}
