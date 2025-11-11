package decorators;

public class MailDecorator {
    final private Mail mail;
    final private String ourDomain;
    final private String aditionalContent;

    public MailDecorator(Mail mail, String ourDomain, String aditionalContent){
        this.mail = mail;
        this.ourDomain = ourDomain;
        this.aditionalContent = aditionalContent;
    }

    public void send(){
        if(!mail.getTo().endsWith(ourDomain)){
            mail.setContent(mail.getContent() + "\n\n" + aditionalContent + "\nOvaj mejl je namenjen samo za " + mail.getTo());
        }
        mail.send();
    }
}
