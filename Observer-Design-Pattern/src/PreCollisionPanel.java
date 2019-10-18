/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class PreCollisionPanel implements AutoBrakeListener {

    @Override
    public void alarm() {
        System.out.println("Red Light blinked on PreCollisionPanel!");
    }
}
