package lab6.fabric;

public class Wood implements Resource {
    @Override
    public void collect() {
        System.out.println("Собран ресурс: Дерево");
    }
}
