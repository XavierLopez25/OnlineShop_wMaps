package Model;

import java.util.*;
public class HashMapM implements Map {

    public HashMap<Object, Object> myHashMap;

    public HashMapM(){
        myHashMap = new HashMap<>();
    }

    public int size(){
        return myHashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return myHashMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return myHashMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return myHashMap.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return myHashMap.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return myHashMap.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return myHashMap.remove(key);
    }

    @Override
    public void putAll(Map m) {
        myHashMap.putAll(m);
    }

    @Override
    public void clear() {
        myHashMap.clear();
    }

    @Override
    public Set keySet() {
        return myHashMap.keySet();
    }

    @Override
    public Collection values() {
        return myHashMap.values();
    }

    @Override
    public Set<Entry<Object,Object>> entrySet() {
        return myHashMap.entrySet();
    }
}
