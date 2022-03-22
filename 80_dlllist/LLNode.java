public class LLNode<Class> {
    public Class data;
    public LLNode next;
    public LLNode last;

    public LLNode(Class data) {
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

    public boolean setData(Class data) {
        this.data = data;
        return true;
    }

    public Class getData() {
        return this.data;
    }

    public LLNode getNext() {
        return next;
    }

    public LLNode getLast() {
        return last;
    }

    public String toString() {
        return data.toString();
    }
}
