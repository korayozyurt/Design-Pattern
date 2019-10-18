import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class AutoBrakeSystem {
    private Vector listeners = new Vector();

    public void registerSubSystem(AutoBrakeListener autoBrakeListener) {
        listeners.add(autoBrakeListener);
    }

    public void brake() {
        for(Enumeration enumeration = listeners.elements(); enumeration.hasMoreElements();) {
            ((AutoBrakeListener) enumeration.nextElement()).alarm();
        }
    }
}
