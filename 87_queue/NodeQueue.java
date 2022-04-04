/*
 * Team JAWs - Jacob Kirmayer, Ari Gurovich, William Vongphanith
 * APCS1 pd6
 * HW87 -- The Busy Commuters Do Not Stand In Line To Refill Their Metrocards (because OMNY exists)
 * 2022-04-03
 * Time Spent: ~0.6 hours
 */

class Node<T> {
    public T data;
    public Node next;

    public Node(T d) {
        data = d;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T d) {
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

public class NodeQueue<T> implements Queue<T> {
    private Node head;
    private Node tail;
    private int size;

    public NodeQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(T o) {
        Node<T> n = new Node<T>(o);
        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            tail = n;
        }

        size++;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        else {
            T d = (T) head.data;
            head = head.getNext();
            size--;
            return d;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peekFront() {
        return (T) head.data;
    }

    public String toString() {
        String s = "";
        Node n = head;
        while (n != null) {
            s += n.toString() + " ";
            n = n.getNext();
        }
        return s;
    }

    public static void main (String[] args) {
        NodeQueue<String> MetrocardRefillingBooth = new NodeQueue<String>();
        System.out.println("There is a line for the metrocard refilling booth.");
        String[] riders = {"John", "William", "Bob", "Jacob", "Richard", "Michael", "David", "James", "Joseph", "Charles", "Thomas", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul"};
        for (int i = 0; i < riders.length; i++) {
            MetrocardRefillingBooth.enqueue(riders[i]);
        }
        System.out.println(MetrocardRefillingBooth);
        System.out.println("\nPeople are filling up their metrocards.");
        for (int i = 0; i < riders.length; i++) {
            System.out.println(MetrocardRefillingBooth.dequeue());
        }
    }
}