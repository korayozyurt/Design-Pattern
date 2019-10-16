/**
 * @Author Koray Ozyurt
 * 16/October/2019
 */

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = CurrencyConverter.getInstance();
        System.out.println(currencyConverter.tlToUsd(200));
    }
}
