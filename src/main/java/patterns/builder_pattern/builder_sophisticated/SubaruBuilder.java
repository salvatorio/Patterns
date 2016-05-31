package patterns.builder_pattern.builder_sophisticated;

/**
 * Created on 27. May. 16.
 */

public class SubaruBuilder extends CarBuilder {

    @Override
    void buildModel() {
        car.setModel("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MECHANICAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }

}
