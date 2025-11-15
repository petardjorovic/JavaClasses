package builder;

public class Main {
    public static void main(String[] args) {
        Mail mail1 = new Mail("Novi prijem", "Ovo je sadrzaj mejla.");
        mail1.sendTo("perodjorovic@gmail.com");
        mail1.sendCC("milos@example.com");
        mail1.sendCC("nenad@example.com");
        mail1.sendBCC("janko@example.com");
        mail1.attach(new MailAttachment("document.docx", "Word document"));
        mail1.attach(new MailAttachment("exam.png", "Image"));
        mail1.send();

        new MailBuilder()
            .subject("Novi prijem")
            .body("Ovo je neki tekst mejla")
            .to("perodjorovic@gmail.com")
            .to("milos@example.com")
            .bcc("janko@example.com")
            .attach("izvestaj.docx", "Word Document")
            .build()
            .send();
    }
}