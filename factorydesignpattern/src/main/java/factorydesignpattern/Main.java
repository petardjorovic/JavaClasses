package factorydesignpattern;

public class Main {
    static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    public static void configure(){
        if(System.getProperty("os.name").equals("Windows 11")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}