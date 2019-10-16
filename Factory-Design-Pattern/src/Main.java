/**
 * @Author Koray Ozyurt
 * 16/October/2019
 */

public class Main {
    public static void main(String[] args) {
        Logistic logistic = LogisticFactory.getLogisticFactory("Airline");
        System.out.println(logistic.calculatePrice(4));
    }
}
