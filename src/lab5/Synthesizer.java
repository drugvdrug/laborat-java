package lab5;

public class Synthesizer extends ElectronicInstrument {

    public Synthesizer(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " играет: синтезированные звуки.");
    }
}