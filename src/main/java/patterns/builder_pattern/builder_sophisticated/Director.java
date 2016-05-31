package patterns.builder_pattern.builder_sophisticated;

/**
 * Created on 27. May. 16.
 */

public class Director {

    CarBuilder builder;

    void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car BuildCar(){

        builder.createCar();
        builder.buildModel();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        Car car = builder.getCar();
        return car;
    }

}
