/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class Amazon extends Company implements Order {

    @Override
    public void createOrder(Product product) {
        setName(product.getCompanyName());
        setCompanyBalance(getCompanyBalance() + product.getPrice());
    }

    @Override
    public String shipOrder() {
        return getName() + " shipped the product.\nCompany balance: " + getCompanyBalance();
    }
}
