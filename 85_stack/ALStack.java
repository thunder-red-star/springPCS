import java.util.ArrayList;

// ArrayList stack implementation

public class ALStack<Pancake> implements Stack<Pancake> {
    private ArrayList<Pancake> stack;

    public ALStack() {
        stack = new ArrayList<Pancake>();
    }

    public void push(Pancake pancake) {
        stack.add(pancake);
    }

    public Pancake pop() {
        return stack.remove(stack.size() - 1);
    }

    public peekTop() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}