package com.emc;

public class EmailAddress {

    private String emailAddress;

    public EmailAddress of(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
