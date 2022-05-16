// Priority Queue interface

public interface PriorityQueue<T> {
    public void add(T item);
    public T remove();
    public T peek();
    public int size();
    public boolean isEmpty();
}