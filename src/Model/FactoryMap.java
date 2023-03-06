package Model;

import java.util.LinkedHashMap;
import java.util.Map;

public class FactoryMap {

    public Map getMapImplementation(int selection){

        return switch (selection) {
            case 1 -> new HashMapM();
            case 2 -> new TreeMapM();
            case 3 -> new LinkedHashMapM();
            default -> null;
        };

    }
}
