package lab5;

public class Drums extends Instrument {

    public Drums(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Играет на барабанах: бум, тап, бум-тап.");
    }
}
