package patterns.factory_method_pattern;

/**
 * Created on 15. June. 16.
 *
 * @author Evgeniy
 */

public class RomeWatch implements Watch{

    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}
