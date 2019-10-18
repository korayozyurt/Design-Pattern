import java.util.Stack;

/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class StockCaretaker {

    private Stack<StockMemento> stockMementos = new Stack<>();

    public void push(StockMemento stockMemento) {
        stockMementos.push(stockMemento);
    }

    public StockMemento restore() {
        stockMementos.pop(); //remove the current state
        return stockMementos.pop();
    }

}
