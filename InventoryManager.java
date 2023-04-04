import java.util.List;

public interface InventoryManager {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product getProduct(List<Product> productList);
}
