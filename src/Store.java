import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList;

    public Store() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (productList.contains(product)) {
            throw new DuplicateProductException(product.getId());
        }
        productList.add(product);
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public void deleteProduct(int id) {
        productList.remove(new Product(id));
    }

    public void editProduct(Product product) {
        int index = productList.indexOf(product);
        if (index >= 0) {
            productList.set(index, product);
        }
    }
}
