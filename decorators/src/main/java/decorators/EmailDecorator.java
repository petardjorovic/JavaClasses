package decorators;

public class EmailDecorator extends Mail {
    private String domain, aditionalContent;

    public EmailDecorator(String to, String content,String domain, String aditionalContent) {
        super(to,content);
        this.domain = domain;
        this.aditionalContent = aditionalContent;
    }

    public EmailDecorator(Mail mail, String domain, String aditionalContent){
        super.setTo(mail.getTo());
        super.setContent(mail.getContent());
        this.domain = domain;
        this.aditionalContent = aditionalContent;
    }

    public EmailDecorator(String domain, String aditionalContent){
        this.domain = domain;
        this.aditionalContent = aditionalContent;
    }

    @Override
    public void send(){
        if(!super.getContent().endsWith(domain)){
            super.setContent(super.getContent() + "\n\n" + aditionalContent + "\nOvaj mejl je namenjen samo za " + super.getTo());
        }
        super.send();
    }
}
