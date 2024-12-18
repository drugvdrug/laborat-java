package lab6.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CrystalFactory {
    private Map<String, CrystalType> crystalTypes = new HashMap<>();

    public CrystalType getCrystalType(String color, String shape) {
        String key = color + "-" + shape;
        if (!crystalTypes.containsKey(key)) {
            crystalTypes.put(key, new CrystalType(color, shape));
        }
        return crystalTypes.get(key);
    }
}