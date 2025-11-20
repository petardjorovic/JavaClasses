package sockets;

public class TemperatureMeasurement {
    private final long timestamp;
    private final double value;

    public TemperatureMeasurement(long timestamp, double value) {
        this.timestamp = timestamp;
        this.value = value;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getValue() {
        return value;
    }
}
