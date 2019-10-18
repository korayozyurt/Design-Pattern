/**
 * @Author Koray Ozyurt
 * 18/October/2019
 */

public class StockMemento {

    private String includedProduct;
    private int numberOfProduct;
    private String location;

    public StockMemento(String includedProduct, int numberOfProduct, String location) {
        this.includedProduct = includedProduct;
        this.numberOfProduct = numberOfProduct;
        this.location = location;
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
}
