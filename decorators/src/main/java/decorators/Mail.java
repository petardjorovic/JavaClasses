package decorators;

public class Mail {
    private String to, content;

    public Mail(){}

    public Mail(String to, String content){
        this.to = to;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTo() {
        return to;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void send(){
        System.out.println("Saljem mejl...");
        System.out.println("Na adresu: " + getTo());
        System.out.println("Sadrzaj mejla je: ");
        System.out.println(getContent());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
    } 
}
