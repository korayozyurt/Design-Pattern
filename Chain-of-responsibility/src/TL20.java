/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class TL20 implements DispenseMoney{
    private DispenseMoney dispenseMoney;

    @Override
    public void setNextMoney(DispenseMoney dispenseMoney) {
        this.dispenseMoney = dispenseMoney;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20) {
            int numberOf50 = currency.getAmount() / 20;
            System.out.println(numberOf50 + " * " + " 20 TL");
            int remainder = currency.getAmount() % 20;
            if(remainder != 0) {
                this.dispenseMoney.dispense(new Currency(remainder));
            }
        } else {
            this.dispenseMoney.dispense(currency);
        }
    }
}
