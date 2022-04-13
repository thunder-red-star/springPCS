import java.util.LinkedList;

public class QQKachoo<Item> implements Deque<Item> {
    private LinkedList<Item> _data;

    public QQKachoo() {
	_data = new LinkedList<Item>();
    }

    public boolean isEmpty() {
	return _data.isEmpty();
    }

    public int size() {
	return _data.size();
    }

    public void addFirst(Item item) {
	_data.addFirst(item);
    }

    public void addLast(Item item) {
	_data.addLast(item);
    }

    public Item removeFirst() {
	return _data.removeFirst();
    }

    public Item removeLast() {
	return _data.removeLast();
    }

    public Item getFirst () {
	return _data.getFirst();
    }
}
