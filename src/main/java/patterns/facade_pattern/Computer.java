package patterns.facade_pattern;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class Computer {

    private Power power = new Power();
    private DVDRom dvdRom = new DVDRom();
    private HDD hdd = new HDD();

    void copy(){
        power.onPower();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
        power.offPower();
    }
}
