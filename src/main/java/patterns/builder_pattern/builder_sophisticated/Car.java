package patterns.builder_pattern.builder_sophisticated;

/**
 * Created on 27. May. 16.
 */

public class Car {

    private String model;
    private Transmission transmission;
    private int maxSpeed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model = '" + model + '\'' +
                ", transmission = " + transmission +
                ", maxSpeed = " + maxSpeed + '}';
    }
}
