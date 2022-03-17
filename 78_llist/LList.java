class LLNode {
    private String data;
    private LLNode next;
    private LLNode last;

    public LLNode(String data) {
        this.data = data;
    }

    public boolean setNext(LLNode next) {
        this.next = next;
        return true;
    }

    public boolean setLast(LLNode last) {
        this.last = last;
        return true;
    }

    public boolean setData(String data) {
        this.data = data;
        return true;
    }

    public String getData() {
        return data;
    }

    public LLNode getNext() {
        return next;
    }

    public LLNode getLast() {
        return last;
    }

    public String toString() {
        return data;
    }
}

public class SuperLList {
    private LLNode head;
    private LLNode tail;
    private int size;

    public SuperLList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(String data) {
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

    public boolean add(int index, String data) {
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

    public String get(int index) {
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
        return curr.getData();
    }

    public boolean set(int index, String data) {
        // Use the smart algorithm in get() to find the node faster than uni-directional traversal
        if (index < 0 || index >= size) {
            return false;
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
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
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
        return true;
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
