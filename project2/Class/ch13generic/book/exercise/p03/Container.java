package project2.Class.ch13generic.book.exercise.p03;

public class Container<K, V> {
    private K Key;
    private V Value;

    public V getValue() {
        return Value;
    }

    public void setValue(K key,V value) {
        this.Value = value;
        this.Key = key;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K key,V value) {
        this.Value = value;
        this.Key = key;
    }
}
