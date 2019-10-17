package file_download;

/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class ECommerceAbstractionImpl implements ECommerceAbstraction {

    private final ECommerceImplementor provider;

    public ECommerceAbstractionImpl(ECommerceImplementor provider) {
        this.provider = provider;
    }

    @Override
    public Object buy(String product) {
        return provider.buyProduct(product);
    }

    @Override
    public boolean ship() {
        return provider.shipOrder();
    }
}
