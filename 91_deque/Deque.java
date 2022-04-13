public interface Deque<Item> {
    void addFirst(Item item);
    void addLast(Item item);
    Item removeFirst();
    Item removeLast();
    Item getFirst();
    int size();
    boolean isEmpty();
}
