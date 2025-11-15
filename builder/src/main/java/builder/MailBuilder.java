package builder;

public class MailBuilder {
    final private Mail mail;


    public MailBuilder(){
        this.mail = new Mail("", "");
    }

    public MailBuilder subject(String subject){
        this.mail.setSubject(subject);
        return this;
    }

    public MailBuilder body(String body){
        this.mail.setBody(body);
        return this;
    }

    public MailBuilder to(String address){
        this.mail.sendTo(address);
        return this;
    }

    public MailBuilder cc(String address){
        this.mail.sendCC(address);
        return this;
    }

    public MailBuilder bcc(String address){
        this.mail.sendBCC(address);
        return this;
    }

    public MailBuilder attach(String name, String type){
        this.mail.attach(new MailAttachment(name, type));
        return this;
    }

    public Mail build(){
        return this.mail;
    }
}
