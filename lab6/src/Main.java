import java.util.Arrays;
class Stack<T> {
    private T[] values;
    private int size = 0;

    public Stack () {
        this(64);
    };
    public Stack (int capacity) {
        values = (T[]) new Object[capacity];
    };

    public T getLast() {
        return values[(size - 1)];
    };

    public T pop() {
        if (size == 0) return null;

        size--;
        T value = values[size];
        values[size] = null;
        return value;
    }

    public void push(T newElement) {
        if (size == values.length) {
            values = Arrays.copyOf(values, 2 * values.length);
        }

        values[size] = newElement;
        size++;
    };

    public int getSize() {
        return size;
    };
};

