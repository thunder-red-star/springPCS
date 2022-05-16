// ArrayList implementation of the PriorityQueue interface.

public class ArrayPriorityQueue<T> implements PriorityQueue<T> {
    private ArrayList<T> data;

    public ArrayPriorityQueue() {
        data = new ArrayList<T>();
    }

    public void add(T item) {
        // Add item to the correct location.
        T m = data.get(0);
        int i = 0;
        while (i < data.size() && m.compareTo(item) > 0) {
            m = data.get(i);
            i++;
            for (int j = data.size() - 1; j > i; j--) {
                data.set(j, data.get(j - 1));
            }
            data.set(i, item);
        }
    }

    public T remove() {
        // Remove and return the item at the front of the queue.
        return data.remove(0);
    }

    public T peek() {
        // Return the item at the front of the queue.
        return data.get(0);
    }

    public int size() {
        // Return the number of items in the queue.
        return data.size();
    }

    public boolean isEmpty() {
        // Return true if the queue is empty, false otherwise.
        return data.isEmpty();
    }
}