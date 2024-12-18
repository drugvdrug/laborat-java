package lab5;

public class Guitar extends Instrument {

    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Играет на гитаре: аккорды C, G, Am, F.");
    }
}
