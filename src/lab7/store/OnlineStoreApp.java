package lab7.store;

public class OnlineStoreApp {
    public static void main(String[] args) {
        ConsoleProductView view = new ConsoleProductView();
        ProductPresenter presenter = new ProductPresenter(view);

        Product productToAdd = presenter.getProducts().get(0);
        presenter.addToCart(productToAdd, 1); // Добавляем 1 Laptop

        productToAdd = presenter.getProducts().get(1);
        presenter.addToCart(productToAdd, 2); // Добавляем 2 Smartphones

        // Попытка добавить товар, превышающий доступный запас
        productToAdd = presenter.getProducts().get(2);
        presenter.addToCart(productToAdd, 20); // Попытка добавить 20 Tablets
    }
}