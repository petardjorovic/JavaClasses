package sm;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AppLog {
    private static PrintWriter pw;

    private void openLogFile() throws Exception {
        if(pw == null){
            System.out.println("Otvaram log...");
            FileOutputStream fos = new FileOutputStream("app.log", true);
            pw = new PrintWriter(fos);
        }
        
    }

    private void closeLogFile(){
        if(pw != null){
            System.out.println("Zatvaram log...");
            pw.close();
        }
    }

    public void write(int errorCode, String errorMessage) throws Exception  {
        String record = System.currentTimeMillis() + "\t" + String.format("%010d", errorCode) + "\t" + errorMessage;
        openLogFile();

        System.out.println("Upisujem u log...");
        pw.println(record);
        pw.flush();

        // closeLogFile();
    }
}
