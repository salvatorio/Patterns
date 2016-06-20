package patterns.observer_pattern.first_variant;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created on 20. June. 16.
 *
 * @author Evgeniy
 */

public class FileObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {

        File f;

        try {
            f = File.createTempFile("TempPreassure", "_txt");

            PrintWriter printWriter = new PrintWriter(f);
            printWriter.print("Weather was changed. Temperature = " + temp + ", Pressure = " + presser + ".");
            printWriter.println();
            printWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
