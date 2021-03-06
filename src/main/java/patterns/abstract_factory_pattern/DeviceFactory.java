package patterns.abstract_factory_pattern;

/**
 * Created on 18. June. 16.
 *
 * @author Evgeniy
 */

public interface DeviceFactory {

    Keyboard getKeyboard();
    Mouse getMouse();
    TouchPad getTouchpad();

}
