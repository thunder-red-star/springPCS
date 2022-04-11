import java.util.ArrayList;

public class ALQueue<T> implements Queue {
    private ArrayList<T> _data;
    private int _size;
    private int _headIdx;
    
    public ALQueue() {
	_data = new ArrayList<T>();
	_size = 0;
	_headIdx = 0;
    }

    public boolean isEmpty() {
	return _size == 0;
    }

    public int size () {
	return _size;
    }

    public void shift () {
        for (int index = 0; index < _size; index++) {
            _data.set(index, _data.get(index + _headIdx));
	}
    }

    public void enqueue (T item) {
	_data.add(item, _size);
	_size++;
    }

    public T dequeue () {
	T item = _data.get(_headIdx);
	_data.remove(_headIdx);
	_size--;
	shift();
	return item;
    }

    public T peekFront () {
	return _data.get(_headIdx);
    }

    public String toString () {
	String result = "";
        for (int index = 0; index < _size; index++) {
	    result += _data.get(index) + " ";
	}

	return result;
    }
}
