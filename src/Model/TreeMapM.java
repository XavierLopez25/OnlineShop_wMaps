package Model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * The type Tree map m.
 */
public class TreeMapM implements Map {

    /**
     * The My tree map.
     */
    public TreeMap<Object, Object> myTreeMap;

    /**
     * Instantiates a new Tree map m.
     */
    public TreeMapM(){
        myTreeMap = new TreeMap<>();
    }

    @Override
    public int size() {
        return myTreeMap.size();
    }

    @Override
    public boolean isEmpty() {
        return myTreeMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return myTreeMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return myTreeMap.containsKey(value);
    }

    @Override
    public Object get(Object key) {
        return myTreeMap.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return myTreeMap.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return myTreeMap.remove(key);
    }

    @Override
    public void putAll(Map m) {
        myTreeMap.putAll(m);
    }

    @Override
    public void clear() {
        myTreeMap.clear();
    }

    @Override
    public Set keySet() {
        return myTreeMap.keySet();
    }

    @Override
    public Collection values() {
        return myTreeMap.values();
    }

    @Override
    public Set<Entry<Object, Object>> entrySet() {
        return myTreeMap.entrySet();
    }
}
