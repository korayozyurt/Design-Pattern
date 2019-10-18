/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class Runway implements ICommand {

    private IAtcMediator atcMediator;

    public Runway(IAtcMediator atcMediator) {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted");
        atcMediator.setLandingStatus(true);
    }
}
