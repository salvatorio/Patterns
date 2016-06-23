package patterns.facade_pattern;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class DVDRom {

    private boolean data = false;

    public boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }
}
