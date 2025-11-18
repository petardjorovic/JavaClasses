package eventlistener;

import java.util.EventListener;
import java.awt.*;

public abstract class MouseDirectionEventListener implements EventListener, AutoCloseable {
    public abstract void movedLeft();
    public abstract void movedRight();
    public abstract void movedUp();
    public abstract void movedDown();

    final private Thread thread;
    private boolean listening;

    public MouseDirectionEventListener(int minimalDistance){
        listening = true;

        thread = new Thread(() -> {
            int oldX = 0, oldY = 0;
            int currentX, currentY;
            int diffX, diffY;

            while (listening) {
               currentX = MouseInfo.getPointerInfo().getLocation().x;
               currentY = MouseInfo.getPointerInfo().getLocation().y;
               
               diffX = currentX - oldX;
               diffY = currentY - oldY;

               if(Math.abs(diffX) < minimalDistance && Math.abs(diffY) < minimalDistance){
                continue;
               }

               oldX = currentX;
               oldY = currentY;

               moved(diffX, diffY);
            }
        });

        thread.start();
    }
    @Override
    public void close() throws Exception {
        listening = false;   
    }

    private void moved(int diffX, int diffY){
        if(Math.abs(diffX) < Math.abs(diffY)){
            movedVertically(diffY);
            return;
        }

        movedHorizontally(diffX);
    }

    private void movedVertically(int diff){
        if(diff < 0){
            movedUp();
            return;
        }

        movedDown();
    }

    private void movedHorizontally(int diff){
        if(diff > 0){
            movedRight();
            return;
        }

        movedLeft();
    }
}
