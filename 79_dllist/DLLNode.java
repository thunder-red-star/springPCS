class DLLNode {
    private String data;
    private DLLNode next;
    private DLLNode last;

    public DLLNode(String data) {
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

    public DLLNode getNext() {
        return next;
    }

    public DLLNode getLast() {
        return last;
    }

    public String toString() {
        return data;
    }
}
