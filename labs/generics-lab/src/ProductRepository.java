import java.util.ArrayList;
import java.util.List;

public class ProductRepository<T> {
    private final List<T> products = new ArrayList<>();

    public final void addProduct(T product) {
        this.products.add(product);
    }

    public final void removeProduct(T product) {
        this.products.remove(product);
    }

    public final List<T> getAllProducts() {
        return this.products;
    }

    protected static class Product {
        private final int id;
        private final String name;

        public Product(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
