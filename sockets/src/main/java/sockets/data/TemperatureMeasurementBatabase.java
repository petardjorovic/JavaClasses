package sockets.data;

import java.util.ArrayList;
import java.util.List;

public class TemperatureMeasurementBatabase {
    private final List<TemperatureMeasurement> values = new ArrayList<>();

    public TemperatureMeasurementBatabase() { }

    synchronized public void add(TemperatureMeasurement measurement){
        values.add(measurement);
    }

    synchronized public double getAverageTemperature(){
        return values.stream().mapToDouble(m -> m.getValue()).average().orElse(0.0);
    }

    synchronized public int getMeasurementCount(){
        return values.size();
    }
}
