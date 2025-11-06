package ak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Robot> roboti = new ArrayList<>();

        roboti.add(new AutoRobot(100, "Auto 1", "test332", 40));
        roboti.add(new LeteciRobot(2, "letelica 1", "test211", 600));
        roboti.add(new TajniRobot(300, "Super tajni robot", "d5sd5sd1s5ds"));
        
        for(Robot r : roboti){
            System.out.println("Tvoje ime? " + r.getIme());
            System.out.println("Tvoja tezina? " + r.getTezina());
        }
    }
}