/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class TL50 implements DispenseMoney {

    private DispenseMoney dispenseMoney;

    @Override
    public void setNextMoney(DispenseMoney dispenseMoney) {
        this.dispenseMoney = dispenseMoney;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50) {
            int numberOf50 = currency.getAmount() / 50;
            System.out.println(numberOf50 + " * " + " 50 TL");
            int remainder = currency.getAmount() % 50;
            if(remainder != 0) {
                this.dispenseMoney.dispense(new Currency(remainder));
            }
        } else {
            this.dispenseMoney.dispense(currency);
        }
    }
}
