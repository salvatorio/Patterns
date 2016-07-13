package patterns.singleton_pattern;

/**
 * Created on 13. July. 16.
 *
 * @author Evgeniy
 */

public class Start {

    public static void main(String[] args) {

        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();

        Singleton.getInstance().stop();
    }
}
