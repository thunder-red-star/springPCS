/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ____ by ____
 * b/c ...
 **/

import java.util.ArrayList;

class Stack<Pancake> {
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


public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    String[] exps = expr.split("\\s+");
    Stack<String> opStack = new Stack();
    int mostRecentOperator = 0;
    
    for (String exp : exps) {
      if (exp == "+") {
        mostRecentOperator = 1;
      } else if (exp == "-") {
        mostRecentOperator = 2
      } else if (exp == "*") {
        mostRecentOperator = 3
      }
      
      if (exp == ")") {
        int result = unload(mostRecentOperator, opStack);
        opStack.push(result)
      } else {
        opStack.push(exp);
      }
    }
  }


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    int result = 0;
    if (op == 1) {
      while (numbers.peek() != "+") {
        result += Integer.parseInt(numbers.pop());
      }
    } else if (op == 2) {
      while (numbers.peek() != "-") {
        result -= Integer.parseInt(numbers.pop());
      }
    } else if (op == 3) {
      while (numbers.peek() != "*") {
        result = result * Integer.parseInt(numbers.pop());
      }
    } else {
      System.out.println("Operation not allowed.");
    }
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }
  */


  //main method for testing
  public static void main( String[] args )
  {

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7
      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17
      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29
      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
