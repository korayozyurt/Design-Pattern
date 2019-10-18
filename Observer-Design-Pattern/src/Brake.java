/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class Brake implements AutoBrakeListener {
    @Override
    public void alarm() {
        System.out.println("Car is stopped!");
    }
}
