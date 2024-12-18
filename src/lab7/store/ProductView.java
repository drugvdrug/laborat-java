package lab7.store;

import java.util.List;

public interface ProductView {
    void displayProducts(List<Product> products);
    void displayTotalPrice(double totalPrice);
    void showError(String message);
}