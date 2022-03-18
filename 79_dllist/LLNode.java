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
