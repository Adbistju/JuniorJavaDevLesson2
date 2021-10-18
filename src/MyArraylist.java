public class MyArraylist<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 1000000;

    public MyArraylist(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        list = (T[]) new Comparable[capacity];
    }

    MyArraylist() {
        list = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public void printSize(){
        System.out.println(list.length);
    }

    public boolean remove(T item) {
        int i = 0;
        while (i < size && !list[i].equals(item)) {
            i++;
        }
        if (i == size) {
            return false;
        }
        if (size - 1 - i >= 0) System.arraycopy(list, i + 1, list, i, size - 1 - i);
        size--;
        list[size] = null;
        return true;
    }

    void add(T item) {
        list[size] = item;
        size++;
    }

    public void add(int index, T item) {
        if (index < 0) {
            index = 0;
        }
        if (index > size) {
            index = size;
        }
        System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = item;
        size++;
    }

    boolean find(T item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        return list[index];
    }

    public void set(int index, T item) {
        list[index] = item;
    }

    public int size() {
        return size;
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += list[i] + " ";
        }
        return s;
    }
}
