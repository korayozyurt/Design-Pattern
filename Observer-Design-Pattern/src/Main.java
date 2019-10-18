/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class Main {
    public static void main(String[] args) {
        AutoBrakeSystem autoBrakeSystem = new AutoBrakeSystem();
        AutoBrakeListener preCollisionPanel = new PreCollisionPanel();
        AutoBrakeListener brakeListener = new Brake();
        autoBrakeSystem.registerSubSystem(preCollisionPanel);
        autoBrakeSystem.registerSubSystem(brakeListener);

        autoBrakeSystem.brake();
    }
}
