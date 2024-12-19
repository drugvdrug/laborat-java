package main.lab6.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ResourceCache {
    private Map<String, Resource> resourceMap = new HashMap<>();

    public Resource getResource(String name, String filePath) {
        if (resourceMap.containsKey(name)) {
            System.out.println("Использование кэшированного ресурса: " + name);
            return resourceMap.get(name);
        }

        Resource resource = new Resource(name, filePath);
        resourceMap.put(name, resource);
        return resource;
    }
}
