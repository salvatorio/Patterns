package patterns.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19. June. 16.
 *
 * @author Evgeniy
 */

public class Client {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);

    }
}
