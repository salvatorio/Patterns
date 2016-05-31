package patterns.builder_pattern.builder_sophisticated;

/**
 * Created on 27. May. 16.
 *
 * Builder sophisticated variant
 */

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new SubaruBuilder());

        //director.setBuilder(new FordMondeoBuilder());

        Car car = director.BuildCar();

        System.out.println(car);
    }
}
