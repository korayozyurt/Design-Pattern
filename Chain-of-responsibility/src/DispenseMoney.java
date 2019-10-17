/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public interface DispenseMoney {
    void setNextMoney(DispenseMoney dispenseMoney);
    void dispense(Currency currency);
}
