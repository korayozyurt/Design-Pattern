package client;

import file_download.ECommerceImplementor;

/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class AmazonECommerceImplementor implements ECommerceImplementor {

    String product;

    @Override
    public String buyProduct(String product) {
        this.product = product;
        return product;
    }

    @Override
    public boolean shipOrder() {
        System.out.println(product + " shipped successfully from Amazon!");
        return true;
    }
}
