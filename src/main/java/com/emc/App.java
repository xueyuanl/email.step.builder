package com.emc;

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


        Email.FromStep fromStep  = Email.builder();
        Email.ToStep toStep = fromStep.from(new EmailAddress().of("Pat.Li@vce.com"));
        Email.SubjectStep subjectStep = toStep.to(new EmailAddress().of("xueyuanl@live.cn"));
        Email.ContentStep contentStep = subjectStep.subject(new Subject().of("Subject"));
        Email.Build build = contentStep.content(new Content().of("Test email"));
        Email email = build.build();


        System.out.println(email.getFrom().getEmailAddress());
        System.out.println(email.getTo());
        System.out.println(email.getSubject().getSubject());
        System.out.println(email.getContent().getContent());
        System.out.println( "Hello World!" );
    }
}
