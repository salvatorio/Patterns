package patterns.observer_pattern.second_variant;

/**
 * Created on 20. June. 16.
 *
 * @author Evgeniy
 */

public class Runner {

    public static void main(String[] args) {

        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        Publisher publisher = new Publisher();

        publisher.addListener(subscriber1);
        publisher.addListener(subscriber2);

        publisher.createMessage("Message!");
    }
}
