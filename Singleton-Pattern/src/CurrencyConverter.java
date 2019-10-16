/**
 * @Author Koray Ozyurt
 * 16/October/2019
 */

public class CurrencyConverter {
    private static CurrencyConverter instance;

    private CurrencyConverter() {}

    public static synchronized CurrencyConverter getInstance() {
        if (instance == null ){
            instance = new CurrencyConverter();
        }
        return instance;
    }

    public double tlToUsd(double tl) {
        return tl * 0.8;
    }
}
