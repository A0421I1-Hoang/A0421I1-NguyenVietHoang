import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone", 20000000, "none", "apple"));
        products.put(2, new Product(2, "Nokia", 10000000, "none", "Nokia"));
        products.put(3, new Product(3, "Samsung", 15000000, "none", "Samsung"));
        products.put(4, new Product(4, "IphoneX", 22000000, "none", "apple"));
        products.put(5, new Product(5, "Iphone12", 25000000, "none", "apple"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id, customer);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
