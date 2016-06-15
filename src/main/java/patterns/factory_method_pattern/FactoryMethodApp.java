package patterns.factory_method_pattern;

/**
 * Created on 15. June. 16.
 *
 * method which returns a specific instance of a particular object
 *
 * @author Evgeniy
 */

public class FactoryMethodApp {

    public static void main(String[] args) {

//        WatchMaker maker = new DigitalWatchMaker();
//        WatchMaker maker = new RomeWatchMaker();
        WatchMaker maker = getMakerByName("Digital");

        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker){
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new RuntimeException("Not supported watch model " + maker);
    }
}
