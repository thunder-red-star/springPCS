class Node {
    private int data;
    private Node next;

    public Node(int d) {
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        data = d;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public String toString() {
        return "" + data;
    }
}

public class LLStack<Pancake> implements Stack<Pancake> {
    private Node top;

    public LLStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Pancake pancake) {
        Node n = new Node(pancake);
        n.setNext(top);
        top = n;
    }

    public Pancake pop() {
        if (top == null) {
            return null;
        }
        Pancake pancake = top.getData();
        top = top.getNext();
        return pancake;
    }

    public Pancake peekTop() {
        if (top == null) {
            return null;
        }
        return top.getData();
    }

    public String toString() {
        String s = "";
        Node n = top;
        while (n != null) {
            s += n.toString() + " ";
            n = n.getNext();
        }
        return s;
    }
}