package com.in.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentBean {

    private Subject subject;

    @Autowired // This annotation tells Spring to inject the Subject bean
    public StudentBean(Subject subject) {
        this.subject = subject;
    }

    public void disp() {
        System.out.println("Subject: " + subject.toString());
    }
}
