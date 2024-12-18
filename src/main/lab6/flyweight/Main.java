package main.lab6.flyweight;

import java.util.HashMap;
import java.util.Map;

// Приспособленец, представляющий ресурс (например, текстуру)
class Resource {
    private String name;
    private String filePath;

    public Resource(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
        loadResource();
    }

    private void loadResource() {
        // Здесь можно добавить логику загрузки ресурса из файла
        System.out.println("Загрузка ресурса: " + name + " из " + filePath);
    }

    public String getName() {
        return name;
    }

    public String getFilePath() {
        return filePath;
    }
}

// Класс для кэширования ресурсов
class ResourceCache {
    private Map<String, Resource> resourceMap = new HashMap<>();

    // Метод для получения ресурса
    public Resource getResource(String name, String filePath) {
        // Если ресурс уже загружен, возвращаем его
        if (resourceMap.containsKey(name)) {
            System.out.println("Использование кэшированного ресурса: " + name);
            return resourceMap.get(name);
        }

        // Если ресурс не загружен, создаем новый и добавляем в кэш
        Resource resource = new Resource(name, filePath);
        resourceMap.put(name, resource);
        return resource;
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        ResourceCache resourceCache = new ResourceCache();

        // Запрашиваем ресурсы
        Resource texture1 = resourceCache.getResource("GrassTexture", "textures/grass.png");
        Resource texture2 = resourceCache.getResource("WaterTexture", "textures/water.png");
        Resource texture3 = resourceCache.getResource("GrassTexture", "textures/grass.png"); // Этот ресурс будет кэширован

        // Проверяем, что кэш работает
        System.out.println("Ресурс 1: " + texture1.getName() + ", путь: " + texture1.getFilePath());
        System.out.println("Ресурс 2: " + texture2.getName() + ", путь: " + texture2.getFilePath());
        System.out.println("Ресурс 3: " + texture3.getName() + ", путь: " + texture3.getFilePath());
    }
}