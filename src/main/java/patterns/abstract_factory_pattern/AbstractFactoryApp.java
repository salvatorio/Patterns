package patterns.abstract_factory_pattern;

/**
 * Created on 18. June. 16.
 *
 * @author Evgeniy
 */

public class AbstractFactoryApp {

    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("RU");

        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        TouchPad touchPad = factory.getTouchpad();

        mouse.click();
        keyboard.print();
        keyboard.println();
        touchPad.track(10, 35);

    }

    private static DeviceFactory getFactoryByCountryCode(String language){

        switch (language){

            case "RU":
                return new RuDeviceFactory();

            case "EN":
                return new EnDeviceFactory();

            default:
                throw new RuntimeException("Unsupported country code " + language);
        }
    }
}
