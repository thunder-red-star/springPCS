import java.util.LinkedList;
import java.util.Iterator;

// doing all these methods made me want to scream so 😱😱😱😱😱😱😱😱😱
public class AllHandsOnDeque<Item> implements Deque<Item> {
    private LinkedList<Item> list = new LinkedList<Item>();

    public void addFirst(Item item) {
        list.addFirst(item);
    }

    public void addLast(Item item) {
        list.addLast(item);
    }

    public boolean offerFirst(Item item) {
        return list.offerFirst(item);
    }

    public boolean offerLast(Item item) {
        return list.offerLast(item);
    }

    public Item removeFirst() {
        return list.removeFirst();
    }

    public Item removeLast() {
        return list.removeLast();
    }

    public Item pollFirst() {
        return list.pollFirst();
    }

    public Item pollLast() {
        return list.pollLast();
    }

    public Item peekFirst() {
        return list.peekFirst();
    }

    public Item peekLast() {
        return list.peekLast();
    }

    public boolean removeFirstOccurrence(Object o) {
        return list.removeFirstOccurrence(o);
    }

    public boolean removeLastOccurrence(Object o) {
        return list.removeLastOccurrence(o);
    }

    public boolean add(Item item) {
        return list.add(item);
    }

    public boolean offer(Item item) {
        return list.offer(item);
    }

    public Item remove() {
        return list.remove();
    }

    public Item poll() {
        return list.poll();
    }

    public Item element() {
        return list.element();
    }

    public Item peek() {
        return list.peek();
    }

    public void push(Item item) {
        list.push(item);
    }

    public Item pop() {
        return list.pop();
    }

    public boolean remove(Object o) {
        return list.remove(o);
    }

    public boolean contains(Object o) {
        return list.contains(o);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public Iterator<Item> iterator() {
        return list.iterator();
    }

    public Object[] toArray() {
        return list.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    public boolean containsAll(java.util.Collection<?> c) {
        return list.containsAll(c);
    }

    public boolean addAll(java.util.Collection<? extends Item> c) {
        return list.addAll(c);
    }

    public Item getFirst() {
        return list.getFirst();
    }

    public Item getLast() {
        return list.getLast();
    }

    public Iterator<Item> descendingIterator() {
        return list.descendingIterator();
    }

    public boolean retainAll(java.util.Collection<?> c) {
        return list.retainAll(c);
    }

    public boolean removeAll(java.util.Collection<?> c) {
        return list.removeAll(c);
    }

    public String toString() {
        // The one time we don't use passthrough methods
        String result = "";
        for (int i = 0; i < list.size() - 1; i++) {
            result += list.get(i) + " -> ";
        }
        result += list.getLast();
        return result;
    }
}
