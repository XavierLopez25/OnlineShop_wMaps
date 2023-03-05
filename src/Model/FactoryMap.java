package Model;

import java.util.Map;

public class FactoryMap {

    public Map getMapImplementation(String selection){

        return switch (selection.toLowerCase()) {
            case "hashmap" -> new HashMapM();
            case "treemap" -> new TreeMapM();
            case "linkedhashmap" -> new LinkedHashMapM();
            default -> null;
        };

    }

}
