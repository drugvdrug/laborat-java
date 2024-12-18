package main.lab3;

import java.util.Arrays;
import java.util.Comparator;

public class GroupSupermarket {

    private static long idCounter = 0; // статический счетчик для уникальных номеров
    private long uniqueId;
    private Product[] products;

    public GroupSupermarket() {
        this.uniqueId = idCounter++;
        this.products = new Product[0]; // Инициализация пустым массивом
    }

    public GroupSupermarket(Product[] products) {
        this.uniqueId = idCounter++;
        this.products = products;
    }

    public long getUniqueId() {
        return uniqueId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product getProduct(int index) {
        if (index < 0 || index >= products.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
        return products[index];
    }

    public void setProduct(int index, Product product) {
        if (index < 0 || index >= products.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
        products[index] = product;
    }

    public void addProduct(Product product) {
        products = Arrays.copyOf(products, products.length + 1); // Увеличиваем размер массива
        products[products.length - 1] = product; // Добавляем новый продукт
    }

    public void removeProduct(long productCode) {
        products = Arrays.stream(products)
                .filter(product -> product.getProductCode() != productCode)
                .toArray(Product[]::new); // Удаляем продукт с указанным кодом
    }

    public void sortProductsByName() {
        Arrays.sort(products, Comparator.comparing(Product::getName));
    }
}
