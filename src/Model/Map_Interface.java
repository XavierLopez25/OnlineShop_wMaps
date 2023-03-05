package Model;

public interface Map_Interface<K, V> {
    void put(K key, V value);

    V get(K get);

    void delete(K key);

    int size();



}
