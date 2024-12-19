package main.lab5;

public abstract class Tool {
    private String name;

    public Tool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void use();
}
