package lab7.store;

import java.util.List;

public class ConsoleProductView implements ProductView {
    @Override
    public void displayProducts(List<Product> products) {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " (Stock: " + product.getStock() + ")");
        }
    }

    @Override
    public void displayTotalPrice(double totalPrice) {
        System.out.println("Total Price: $" + totalPrice);
    }

    @Override
    public void showError(String message) {
        System.out.println("Error: " + message);
    }
}