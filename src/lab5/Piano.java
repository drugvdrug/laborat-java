package lab5;

public class Piano extends Instrument {

    public Piano(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Играет на пианино: до, ре, ми, фа, соль, ля, си.");
    }
}