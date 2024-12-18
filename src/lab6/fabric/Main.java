package lab6.fabric;

public class Main {
    public static void main(String[] args) {
        ResourceFactory resourceFactory = new ResourceFactory();

        Resource wood = resourceFactory.createResource("wood");
        wood.collect();

        Resource stone = resourceFactory.createResource("stone");
        stone.collect();

        try {
            Resource unknown = resourceFactory.createResource("gold");
            unknown.collect();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}