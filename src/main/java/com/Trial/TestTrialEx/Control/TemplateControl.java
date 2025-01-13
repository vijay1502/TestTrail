package com.Trial.TestTrialEx.Control;

import com.Trial.TestTrialEx.Domain.TestClass;
import com.Trial.TestTrialEx.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/")
public class TemplateControl {

    @Autowired
    TestService testService;
@PostMapping("/add")
    public com.Trial2.TesterTrail.Domain.TestClass updateAndParse(@RequestBody com.Trial2.TesterTrail.Domain.TestClass testClass){
    return testService.updateTest(testClass);
}
}
