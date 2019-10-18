/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public interface IAtcMediator {

    void registerRunway(Runway runway);

    void registerFlight(Flight flight);

    boolean isLandingOk();

    void setLandingStatus(boolean status);
}
