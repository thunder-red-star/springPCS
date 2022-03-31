/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
    public static void main( String[] args )
    {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // USAGE: un-comment exactly 1 assignment below
        Stack<Integer> pan   = new ALStack<Integer>();
        Stack<String> cakes = new LLStack<String>();

        pan.push(new Integer(1));
        pan.push(new Integer(2));
        pan.push(new Integer(3));
        pan.push(new Integer(4));
        pan.push(new Integer(9));
        pan.pop();
        pan.pop();
        pan.pop();
        pan.peekTop();
        pan.pop();
        pan.pop();
        pan.isEmpty();

        cakes.push("Pancake");
        cakes.push("Waffle");
        cakes.push("Egg");
        cakes.push("Cupcake");
        cakes.push("Cookie");
        cakes.pop();
        cakes.pop();
        cakes.pop();
        cakes.peekTop();
        cakes.pop();
        cakes.size();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //...

    }//end main

}//end class