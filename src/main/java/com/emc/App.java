package com.emc;

import com.emc.step.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*Email email = Email.builder()
                .from(new EmailAddress().of("Pat.Li@vce.com"))
                .to(new EmailAddress().of("xueyuanl@live.cn"))
                .subject(new Subject().of("Subject"))
                .content(new Content().of("Test email"))
                .build();*/


        FromStep fromStep  = Builder.builder();
        ToStep toStep = fromStep.from(new EmailAddress().of("Pat.Li@vce.com"));
        SubjectStep subjectStep = toStep.to(new EmailAddress().of("xueyuanl@live.cn"));
        ContentStep contentStep = subjectStep.subject(new Subject().of("Subject"));
        BuildStep buildStep = contentStep.content(new Content().of("Test email"));
        Email email = buildStep.build();


        System.out.println(email.getFrom().getEmailAddress());
        System.out.println(email.getTo());
        System.out.println(email.getSubject().getSubject());
        System.out.println(email.getContent().getContent());
        System.out.println( "Hello World!" );
    }
}
