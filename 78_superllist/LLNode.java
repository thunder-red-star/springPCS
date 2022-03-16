public class LLNode {
    private LLNode _next;
    private LLNode _prev;
    private String _data;

    public LLNode (String data) {
        this._data = data;
    }

    public String getCargo () {
        return this._data;
    }

    public boolean setCargo (String newData) {
        this._data = newData;
        return true;
    }

    public LLNode getPrev () {
        return this._prev;
    }

    public LLNode getNext () {
        return this._next;
    }

    public boolean setPrev (LLNode newPrev) {
        this._prev = newPrev;
        return true;
    }

    public boolean setNext (LLNode newNext) {
        this._next = newNext;
        return true;
    }

    public String toString () {
        return this._data;
    }
}