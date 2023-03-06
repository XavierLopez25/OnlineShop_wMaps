package Model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The type Factory map.
 */
public class FactoryMap {

    /**
     * Get map implementation map.
     *
     * @param selection the selection
     * @return the map
     */
    public Map getMapImplementation(int selection){

        return switch (selection) {
            case 1 -> new HashMapM();
            case 2 -> new TreeMapM();
            case 3 -> new LinkedHashMapM();
            default -> null;
        };

    }
}
