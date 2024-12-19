package main.lab6.flyweight;

public class Main {
    public static void main(String[] args) {
        ResourceCache resourceCache = new ResourceCache();

        Resource texture1 = resourceCache.getResource("GrassTexture", "textures/grass.png");
        Resource texture2 = resourceCache.getResource("WaterTexture", "textures/water.png");
        Resource texture3 = resourceCache.getResource("GrassTexture", "textures/grass.png"); // Этот ресурс будет кэширован

        System.out.println("Ресурс 1: " + texture1.getName() + ", путь: " + texture1.getFilePath());
        System.out.println("Ресурс 2: " + texture2.getName() + ", путь: " + texture2.getFilePath());
        System.out.println("Ресурс 3: " + texture3.getName() + ", путь: " + texture3.getFilePath());
    }
}