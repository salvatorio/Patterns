package patterns.singleton_pattern;

/**
 * Created on 13. July. 16.
 *
 * @author Evgeniy
 */

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void print(){
        System.out.println(this);
    }

    public void stop(){
        System.out.println("stop");
    }
}
