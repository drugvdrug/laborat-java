package main.lab3;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Овощи", 101, "Картошка", "Россия", 30, "Фермер");
        Product product2 = new Product("Фрукты", 102, "Яблоко", "США", 50, "Сад");
        Product product3 = new Product("Молочные продукты", 103, "Молоко", "Россия", 40, "Завод");

        GroupSupermarket supermarket = new GroupSupermarket(new Product[]{product1, product2, product3});

        System.out.println("Продукты в супермаркете:");
        for (Product product : supermarket.getProducts()) {
            System.out.println("- " + product.getName() + " (Код: " + product.getProductCode() + ")");
        }

        Product product4 = new Product("Крупы", 104, "Гречка", "Россия", 60, "Фермер");
        supermarket.addProduct(product4);
        System.out.println("\nПосле добавления нового продукта:");
        for (Product product : supermarket.getProducts()) {
            System.out.println("- " + product.getName() + " (Код: " + product.getProductCode() + ")");
        }

        supermarket.removeProduct(102); // Удаляем продукт с кодом 102
        System.out.println("\nПосле удаления продукта с кодом 102:");
        for (Product product : supermarket.getProducts()) {
            System.out.println("- " + product.getName() + " (Код: " + product.getProductCode() + ")");
        }

        supermarket.sortProductsByName();
        System.out.println("\nПосле сортировки по названию:");
        for (Product product : supermarket.getProducts()) {
            System.out.println("- " + product.getName() + " (Код: " + product.getProductCode() + ")");
        }
    }
}
