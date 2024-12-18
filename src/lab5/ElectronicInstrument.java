package lab5;

abstract class ElectronicInstrument extends Instrument {
    protected String name;
    protected int volume;

    // Конструктор
    public ElectronicInstrument(String name) {
        super(name);
        this.volume = 50;
    }

    // Метод для настройки громкости
    public void adjustVolume(int newVolume) {
        if (newVolume < 0) {
            volume = 0;
        } else volume = Math.min(newVolume, 100);
        System.out.println(name + " громкость установлена на: " + volume);
    }
}