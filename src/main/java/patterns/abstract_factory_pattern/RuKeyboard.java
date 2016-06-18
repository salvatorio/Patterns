package patterns.abstract_factory_pattern;

/**
 * Created on 18. June. 16.
 *
 * @author Evgeniy
 */

public class RuKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.print("Печатаем строку. ");
    }

    @Override
    public void println() {
        System.out.println("Печатаем строку с переводом строки. ");
    }
}
