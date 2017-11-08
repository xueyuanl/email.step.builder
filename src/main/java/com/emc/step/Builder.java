package com.emc.step;

import com.emc.Content;
import com.emc.Email;
import com.emc.EmailAddress;
import com.emc.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Builder implements FromStep, ToStep, SubjectStep, ContentStep, BuildStep {

    private EmailAddress from;
    private List<EmailAddress> to;
    private List<EmailAddress> cc;
    private Subject subject;
    private Content content;

    public static FromStep builder(){
        return new Builder();
    }

    public ToStep from(EmailAddress from) {
        this.from = from;
        return this;
    }

    public SubjectStep to(EmailAddress... to) {
        this.to = new ArrayList<EmailAddress>(Arrays.asList(to));
        return this;
    }

    public BuildStep cc(EmailAddress... cc) {
        this.cc = new ArrayList<EmailAddress>(Arrays.asList(cc));
        return this;
    }

    public ContentStep subject(Subject subject) {
        this.subject = subject;
        return this;
    }

    public BuildStep content(Content content) {
        this.content = content;
        return this;
    }

    public Email build() {
        return new Email(this);
    }

    public EmailAddress getFrom() {
        return from;
    }

    public List<EmailAddress> getTo() {
        return to;
    }

    public List<EmailAddress> getCc() {
        return cc;
    }

    public Subject getSubject() {
        return subject;
    }

    public Content getContent() {
        return content;
    }
}
