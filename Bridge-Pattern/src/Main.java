import client.AmazonECommerceImplementor;
import file_download.ECommerceAbstraction;
import file_download.ECommerceAbstractionImpl;

/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class Main {
    public static void main(String[] args) {
        ECommerceAbstraction customer = new ECommerceAbstractionImpl(new AmazonECommerceImplementor());
        customer.buy("Volkswagen Jetta");
        System.out.println(customer.ship());
    }
}
