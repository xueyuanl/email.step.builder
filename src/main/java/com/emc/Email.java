package com.emc;

import com.emc.step.Builder;
import java.util.List;

public class Email {
    private EmailAddress from;
    private List<EmailAddress> to;
    private List<EmailAddress> cc;
    private Subject subject;
    private Content content;

    public Email(Builder builder){
        this.from = builder.getFrom();
        this.to = builder.getTo();
        this.cc = builder.getCc();
        this.subject = builder.getSubject();
        this.content = builder.getContent();
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

    /* public interface FromStep{
        ToStep from(EmailAddress from);
    }

    public interface ToStep{
        SubjectStep to(EmailAddress... to);
    }

    public interface SubjectStep{
        ContentStep subject(Subject subject);
    }

    public interface ContentStep{
        Build content(Content content);
    }

    public interface Build{
        Email build();
        Build cc(List<EmailAddress> cc);
    }*/

    /*public static class Builder implements FromStep, ToStep, SubjectStep, ContentStep, Build{
        private EmailAddress from;
        private List<EmailAddress> to;
        private List<EmailAddress> cc;
        private Subject subject;
        private Content content;

        public ToStep from(EmailAddress from){
            this.from = from;
            return this;
        }

        public SubjectStep to(EmailAddress... to){
            this.to = new ArrayList<EmailAddress>(Arrays.asList(to));
            return this;
        }

        public Build cc(List<EmailAddress> cc) {
            this.cc = cc;
            return this;
        }

        public ContentStep subject(Subject subject){
            this.subject = subject;
            return this;
        }

        public Build content(Content content){
            this.content = content;
            return this;
        }

        public Email build(){
            return new Email(this);
        }

    }*/

}
