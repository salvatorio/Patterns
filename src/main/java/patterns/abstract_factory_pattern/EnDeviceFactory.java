package patterns.abstract_factory_pattern;

/**
 * Created on 18. June. 16.
 *
 * @author Evgeniy
 */

public class EnDeviceFactory implements DeviceFactory {

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public TouchPad getTouchpad() {
        return new EnTouchPad();
    }
}
