package patterns.builder_pattern.builder_plain;

/**
 * Created on 27. May. 16.
 *
 * The builder should be able to build parts for our car
 *
 */

public class CarBuilder {

    // Default values
    private String mod = "Car";
    private Transmission tran = Transmission.MECHANICAL;
    private int sp = 120;

    CarBuilder buildModel(String mod){
        this.mod = mod;
        return this;
    }

    CarBuilder buildTransmission(Transmission tran){
        this.tran = tran;
        return this;
    }

    CarBuilder buildMaxSpeed(int sp){
        this.sp = sp;
        return this;
    }

    Car build(){

        Car car = new Car();
        car.setModel(mod);
        car.setTransmission(tran);
        car.setMaxSpeed(sp);
        return car;

    }
}
