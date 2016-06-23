package patterns.facade_pattern;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class HDD {

    public void copyFromDVD(DVDRom dvdRom){

        if (dvdRom.hasData()){
            System.out.println("Copying data from DVD");
        }
        else {
            System.out.println("Insert DVD to copying");
        }
    }
}
