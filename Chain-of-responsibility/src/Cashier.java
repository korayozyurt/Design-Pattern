/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class Cashier {

    DispenseMoney dispenseMoney50TL = new TL50();
    DispenseMoney dispenseMoney20TL = new TL20();
    DispenseMoney dispenseMoney10TL = new TL10();

    public Cashier() {
        this.dispenseMoney50TL.setNextMoney(this.dispenseMoney20TL);
        this.dispenseMoney20TL.setNextMoney(this.dispenseMoney10TL);
    }

    public void calculateDispenseMoney(int amount) {
        this.dispenseMoney50TL.dispense(new Currency(amount));
    }
}
