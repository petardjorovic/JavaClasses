package decorators;

public class Main {
    public static void main(String[] args) {
        Mail mail = new EmailDecorator("@yahoo.com","Ovo je neki dodatni tekst.");
        mail.setTo("perodjorovic@gmail.com");
        mail.setContent("Ovo je neki test mail.");
        mail.send();

        // new MailDecorator(mail, "@yahoo.com", "Ovo je neki dodatni tekst.").send();
        // new EmailDecorator(mail,"@yahoo.com","Ovo je neki dodatni tekst.").send();
    }
}