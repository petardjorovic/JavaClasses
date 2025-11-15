package builder2;

/**
 * Just another feature of a car.
 */
public class Engine {
    final private double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(double mileage){
        if(started) {
            mileage += mileage;
        } else {
            System.out.println("Cannot go(), you must start engine first!");
        }
    }

    public double getMileage() {
        return mileage;
    }

    public double getVolume() {
        return volume;
    }
}
