/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Jetta", 6,"Hamburg");

        StockCaretaker stockCaretaker = new StockCaretaker();

        stockCaretaker.push(stock.createMemento());
        System.out.println(stock.toString());

        stock.setLocation("Antalya");
        stockCaretaker.push(stock.createMemento());
        System.out.println(stock.toString());

        stock.setLocation("Ankara");
        stock.setNumberOfProduct(3);
        stockCaretaker.push(stock.createMemento());
        System.out.println(stock.toString());

        stock.mementoToStock(stockCaretaker.restore());
        System.out.println(stock.toString());
    }
}
