package patterns.builder_pattern.builder_sophisticated;

import patterns.builder_pattern.*;

/**
 * Created on 27. May. 16.
 */

public class FordMondeoBuilder extends CarBuilder {

    @Override
    void buildModel() {
        car.setModel("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
