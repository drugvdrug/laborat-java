package lab7.store;

import java.util.ArrayList;
import java.util.List;

public class ProductPresenter {
    private ProductView view;
    private List<Product> products;
    private List<Product> cart;

    public ProductPresenter(ProductView view) {
        this.view = view;
        this.products = new ArrayList<>();
        this.cart = new ArrayList<>();
        initializeProducts();
    }

    private void initializeProducts() {
        products.add(new Product("Laptop", 999.99, 10));
        products.add(new Product("Smartphone", 499.99, 20));
        products.add(new Product("Tablet", 299.99, 15));
        view.displayProducts(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addToCart(Product product, int quantity) {
        try {
            product.reduceStock(quantity);
            cart.add(product);
            double totalPrice = calculateTotalPrice();
            view.displayTotalPrice(totalPrice);
        } catch (IllegalArgumentException e) {
            view.showError(e.getMessage());
        }
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}