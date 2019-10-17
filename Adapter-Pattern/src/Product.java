/**
 * @Author Koray Ozyurt
 * 17/October/2019
 */

public class Product {
    String companyName;
    double price;

    public Product(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        this.price = price;
    }
}
