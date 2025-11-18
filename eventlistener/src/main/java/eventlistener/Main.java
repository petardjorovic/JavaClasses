package eventlistener;

public class Main {
    public static void main(String[] args) {
        MouseDirectionEventListener mdel = new MouseDirectionEventListener(100) {

            @Override
            public void movedLeft() {
                System.out.println("Levo");
            }

            @Override
            public void movedRight() {
                System.out.println("Desno");
            }
            
            @Override
            public void movedUp() {
                System.out.println("Gore");
            }
            
            @Override
            public void movedDown() {
                System.out.println("Dole");
            }
            
        };
    }
}