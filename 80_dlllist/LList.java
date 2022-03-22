public class LList<Class> implements List<Class> {
    private LLNode<Class> head;
    private LLNode<Class> tail;
    private int size;

    public LList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(Class data) {
        LLNode newNode = new LLNode(data);
        // Add to end, so that tail is always the last node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setLast(tail);
            tail = newNode;
        }
        size++;
        return true;
    }

    public boolean add(int index, Class data) {
        if (index < 0 || index > size) {
            return false;
        }
        LLNode newNode = new LLNode(data);
        if (index == 0) {
            newNode.setNext(head);
            head.setLast(newNode);
            head = newNode;
        } else if (index == size) {
            tail.setNext(newNode);
            newNode.setLast(tail);
            tail = newNode;
        } else {
            LLNode curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getNext();
            }
            newNode.setNext(curr);
            newNode.setLast(curr.getLast());
            curr.getLast().setNext(newNode);
            curr.setLast(newNode);
        }
        size++;
        return true;
    }

    public Class get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        // Indexing based on position saves ~50% of time...
        LLNode curr = null;
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getNext();
            }
        } else {
            curr = tail;
            for (int i = size - 1; i > index; i--) {
                curr = curr.getLast();
            }
        }
        return curr.data;
    }

    public Class set(int index, Class data) {
        // Use the smart algorithm in get() to find the node faster than uni-directional traversal
        if (index < 0 || index >= size) {
            return null;
        }
        LLNode curr = null;
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getNext();
            }
        } else {
            curr = tail;
            for (int i = size - 1; i > index; i--) {
                curr = curr.getLast();
            }
        }
        curr.setData(data);
        return curr.data;
    }

    public Class remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        LLNode curr = null;
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getNext();
            }
        } else {
            curr = tail;
            for (int i = size - 1; i > index; i--) {
                curr = curr.getLast();
            }
        }

        // Handle edge cases
        if (curr == head) {
            head = head.getNext();
            head.setLast(null);
        } else if (curr == tail) {
            tail = tail.getLast();
            tail.setNext(null);
        } else {
            // Normal behavior
            curr.getLast().setNext(curr.getNext());
            curr.getNext().setLast(curr.getLast());
        }

        size--;
        return curr.data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = "[";
        LLNode curr = head;
        result += curr.getData();
        while (curr.getNext() != null) {
            curr = curr.getNext();
            result += " -> " + curr.getData();
        }
        result += "]";
        return result;
    }
}
