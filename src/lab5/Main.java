package lab5;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Piano("Yamaha");
        instruments[1] = new Guitar("Ibanez");
        instruments[2] = new Drums("Tama");

        for (Instrument instrument : instruments) {
            instrument.play();
        }

        Synthesizer synthesizer = new Synthesizer("Синтезатор");
        synthesizer.adjustVolume(75);
        synthesizer.play();
    }
}
