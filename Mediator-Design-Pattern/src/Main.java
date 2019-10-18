/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class Main {
    public static void main(String[] args) {
        IAtcMediator atcMediator = new AtcMediator();

        Flight tk2432 = new Flight(atcMediator);
        Runway LTAI = new Runway(atcMediator);

        atcMediator.registerFlight(tk2432);
        atcMediator.registerRunway(LTAI);

        tk2432.getReady();
        LTAI.land();
        tk2432.land();
    }
}
