/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class Stock {

    private String includedProduct;
    private int numberOfProduct;
    private String location;

    public Stock(String includedProduct, int numberOfProduct, String location) {
        this.includedProduct = includedProduct;
        this.numberOfProduct = numberOfProduct;
        this.location = location;
    }

    public StockMemento createMemento() {
        return new StockMemento(this.includedProduct, this.numberOfProduct, this.location);
    }

    public void mementoToStock(StockMemento stockMemento) {
        this.includedProduct = stockMemento.getIncludedProduct();
        this.numberOfProduct = stockMemento.getNumberOfProduct();
        this.location = stockMemento.getLocation();
    }

    public String getIncludedProduct() {
        return includedProduct;
    }

    public void setIncludedProduct(String includedProduct) {
        this.includedProduct = includedProduct;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "includedProduct='" + includedProduct + '\'' +
                ", numberOfProduct=" + numberOfProduct +
                ", location='" + location + '\'' +
                '}';
    }
}
