package com.in.main;

import org.springframework.stereotype.Component;

@Component
public class Subject {

    private String sub;

    public Subject() {
        this.sub = "SpringBoot";  
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return sub;  // Removed potential non-breaking space or special character
    }
}
