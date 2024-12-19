package main.lab6.flyweight;

public class Resource {
    private String name;
    private String filePath;

    public Resource(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
        loadResource();
    }

    private void loadResource() {
        System.out.println("Загрузка ресурса: " + name + " из " + filePath);
    }

    public String getName() {
        return name;
    }

    public String getFilePath() {
        return filePath;
    }
}
