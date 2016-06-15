package patterns.factory_method_pattern;

import java.util.Date;

/**
 * Created on 15. June. 16.
 *
 * @author Evgeniy
 */

public class DigitalWatch implements Watch{

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
