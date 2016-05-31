package patterns.builder_pattern.builder_sophisticated;

/**
 * Created on 27. May. 16.
 */

abstract class CarBuilder {

    Car car;
    void createCar(){
        car = new Car();
    }

    abstract void buildModel();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }

}
