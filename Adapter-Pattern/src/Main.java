/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class Main {
    public static void main(String[] args) {
        Order order = new Amazon();
        order.createOrder(new Product("MKT", 500));
        System.out.println(order.shipOrder());
    }
}
