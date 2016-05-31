package patterns.builder_pattern.builder_plain;

/**
 * Created on 27. May. 16.
 *
 * Building one special car
 *
 */

public class Main {

    public static void main(String[] args) {

        Car car = new CarBuilder()
                .buildModel("Mersedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();

        System.out.println(car);

    }
}
