package builder;

public class MailAttachment {
    private String name;
    private String type;

    public MailAttachment(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MailAttachment [name=" + name + ", type=" + type + "]";
    }    
}
