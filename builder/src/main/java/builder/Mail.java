package builder;

import java.util.ArrayList;
import java.util.List;

public class Mail {
    private String subject, body;
    final private List<String> toAddresses; 
    final private List<String> ccAddresses; 
    final private List<String> bccAddresses; 
    final private List<MailAttachment> attachment;

    public Mail(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.toAddresses = new ArrayList<>();
        this.ccAddresses = new ArrayList<>();
        this.bccAddresses = new ArrayList<>();
        this.attachment = new ArrayList<>();
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void sendTo(String email){
        this.toAddresses.add(email);
    }

    public void sendCC(String email){
        this.ccAddresses.add(email);
    }

    public void sendBCC(String email){
        this.bccAddresses.add(email);
    }

    public void attach(MailAttachment attachment){
        this.attachment.add(attachment);
    }

    private String fromList(List<String> lista){
        return String.join("; ", lista);
    }

    private String[] getAttachmentArray(){
        String[] niz = new String[this.attachment.size()];
        
        int i = 0;
        for(MailAttachment attach : this.attachment){
            niz[i++] = attach.toString();
        }

        return niz;
    }

    @Override
    public String toString() {
        return "Mail [subject=" + subject + ", body=" + body + ", to=" + fromList(toAddresses) + ", cc=" + fromList(ccAddresses) + ", bcc=" + fromList(bccAddresses) + ", attachment=" + String.join(";", getAttachmentArray()) +"]";
    }

    public void send(){
        System.out.println("Sending...");
        System.out.println(this);
    }
}
