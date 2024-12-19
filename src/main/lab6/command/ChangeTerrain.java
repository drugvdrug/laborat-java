package main.lab6.command;

public class ChangeTerrain implements Command {
    private String terrainType;

    public ChangeTerrain(String terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public void execute() {
        System.out.println("Изменение типа местности на: " + terrainType);
    }
}
