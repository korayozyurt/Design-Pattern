/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class Flight implements ICommand {

    private IAtcMediator atcMediator;

    public Flight(IAtcMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Landed");
            atcMediator.setLandingStatus(true);
        } else {
            System.out.println("Waiting to land");
        }
    }

    public void getReady() {
        System.out.println("ready");
    }
}
