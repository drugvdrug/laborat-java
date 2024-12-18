package lab6.fabric;

public class Stone implements Resource {
    @Override
    public void collect() {
        System.out.println("Собран ресурс: Камень");
    }
}
