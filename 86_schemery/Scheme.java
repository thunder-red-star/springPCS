import java.util.ArrayList;
import java.util.Arrays;

class Stack<Pancake> {
    private ArrayList<Pancake> stack;

    public Stack() {
        stack = new ArrayList<Pancake>();
    }

    public void push(Pancake pancake) {
        stack.add(pancake);
    }

    public Pancake pop() {
        return stack.remove(stack.size() - 1);
    }

    public Pancake peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public String toString() {
        String result = "";
        for (Pancake pancake : stack) {
            result += pancake.toString() + " ";
        }
        return result;
    }
}

public class Scheme {
    public static int convert (String op) {
        if (op.equals("+")) {
            return 1;
        }
        else if (op.equals("-")) {
            return 2;
        }
        else if (op.equals("*")) {
            return 3;
        }
        else {
            return 0;
        }
    }

    /***
     * precond:  Assumes expr is a valid Scheme (prefix) expression,
     *           with whitespace separating all operators, parens, and
     *           integer operands.
     * postcond: Returns the simplified value of the expression, as a String
     * eg,
     *           evaluate( "( + 4 3 )" ) -> 7
     *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
     **/
    public static String evaluate(String expr) {
        Stack<String> numbers = new Stack<String>();
        Stack<String> ops = new Stack<String>();
        String[] tokens = expr.split(" ");
        for (String token : tokens) {
            if (token.equals("(")) {
                numbers.push(token);
            }
            else if (token.equals("+") || token.equals("-") || token.equals("*")) {
                ops.push(token);
            }
            else if (token.equals(")")) {
                numbers.push(unload(convert(ops.pop()), numbers));
            }
            else {
                numbers.push(token);
            }
        }
        while (!ops.isEmpty()) {
            numbers.push(unload(convert(ops.pop()), numbers));
        }
        return numbers.pop();
    }

    /***
     * precond:  Assumes top of input stack is a number.
     * postcond: Performs op on nums until closing paren is seen thru peek().
     *           Returns the result of operating on sequence of operands.
     *           Ops: + is 1, - is 2, * is 3
     **/
    public static String unload(int op, Stack<String> numbers) {
        Stack<String> temp = new Stack<String>();
        while (!numbers.peek().equals("(")) {
            temp.push(numbers.pop());
        }
        numbers.pop();
        int result = Integer.parseInt(temp.pop());
        if (op == 1) {
            while (!temp.isEmpty()) {
                result += Integer.parseInt(temp.pop());
            }
        }
        else if (op == 2) {
            while (!temp.isEmpty()) {
                result -= Integer.parseInt(temp.pop());
            }
        }
        else if (op == 3) {
            while (!temp.isEmpty()) {
                result *= Integer.parseInt(temp.pop());
            }
        }
        return Integer.toString(result);
    }

    public static void main(String[] args) {
        String zoo1 = "( + 4 3 )";
        System.out.println(zoo1);
        System.out.println("zoo1 eval'd: " + evaluate(zoo1));
        //...7
        String zoo2 = "( + 4 ( * 2 5 ) 3 )";
        System.out.println(zoo2);
        System.out.println("zoo2 eval'd: " + evaluate(zoo2));
        //...17
        String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
        System.out.println(zoo3);
        System.out.println("zoo3 eval'd: " + evaluate(zoo3));
        //...29
        String zoo4 = "( - 1 2 3 )";
        System.out.println(zoo4);
        System.out.println("zoo4 eval'd: " + evaluate(zoo4));
        //...-4
    }
}
