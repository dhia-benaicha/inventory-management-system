import java.util.List;

public class Inventory implements InventoryManager{

    List<Product> productList;

    public Inventory(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public Product getProduct(List<Product> productList) {
        return null;
    }
}
