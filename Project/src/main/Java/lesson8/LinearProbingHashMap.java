package lesson8;

public class LinearProbingHashMap<Key, Value> {
    private int capacity = 97;
    private int size;
    private Value nonElement;
    private Key[] keys;
    private Value[] values;


    public LinearProbingHashMap(int capacity, Value nonElement ) {
        this.capacity = capacity;
        this.nonElement = nonElement;
        this.size = 0;
        keys = (Key[]) new Object[capacity];
        values = (Value[]) new Object[capacity];
    }

    public LinearProbingHashMap() {
        this.capacity = 97;
        this.nonElement = (Value) new Integer(-1);
        this.size = 0;
        keys = (Key[]) new Object[capacity];
        values = (Value[]) new Object[capacity];
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public final int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public final int hash2(Key key) {
        return 7 - (key.hashCode() & 0x7fffffff) % 7;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    private void isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("key == null");
        }
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        if (size == capacity - 1) {
            throw new RuntimeException("Места нет ");
        }

        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if (key.equals(keys[i])) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public Value get(Key key) {
        isKeyNotNull(key);
        for (int i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if (key.equals(keys[i])) {
                return values[i];
            }
        }
        return null;
    }

    public Value delete(Key key) {
        isKeyNotNull(key);
        for (int i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if (key.equals(keys[i])) {
                Value temp = values[i];
                values[i] = nonElement;
                return temp;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i <capacity ; i++) {
            if (values[i] == nonElement || values[i] == null) continue;
            sb.append(keys[i]).append(", ");
        }
        return sb.toString();
    }
}
