package com.Trial.TestTrialEx.Domain;

import jakarta.persistence.*;
import org.hibernate.annotations.GeneratedColumn;
import org.springframework.stereotype.Component;


public class TestClass {

    private long testId;

    private String nickName;

    private int age;

    public TestClass() {
    }

    public TestClass(long testId, String nickName, int age) {
        this.testId = testId;
        this.nickName = nickName;
        this.age = age;
    }

    public long getTestId() {
        return testId;
    }

    public void setTestId(long testId) {
        this.testId = testId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
