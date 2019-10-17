/**
 * @Author Koray Ozyurt
 * 16/October/2019
 */

abstract class Logistic {
    protected double rate;

    abstract void setRate();

    public double calculatePrice(double kilogram) {
        return kilogram * rate;
    }
}
