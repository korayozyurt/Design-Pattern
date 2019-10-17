/**
 * @Author Koray Ozyurt
 * 16/October/2019
 */

public class LogisticFactory {

    public static Logistic getLogisticFactory(String type) {
        if(type.equals(Airline.class.getName())) {
            return new Airline();
        } else if(type.equals(Seaway.class.getName())) {
            return new Seaway();
        }
        return null;
    }
}
