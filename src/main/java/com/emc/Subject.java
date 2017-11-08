package com.emc;

public class Subject {

    private String subject;

    public Subject of(String subject){
        this.subject = subject;
        return this;
    }

    public String getSubject() {
        return subject;
    }
}
