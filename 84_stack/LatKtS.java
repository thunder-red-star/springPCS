
/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

import java.util.*;

public class LatKtS
{

    public static boolean contains (String[] array, String value) {
        for (String character : array) {
            if (character.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /***
     * precondition:  input string has length > 0
     * postcondition: returns reversed string s
     *                flip("desserts") -> "stressed"
     **/
    public static String flip( String s )
    {
        String[] characters = s.split("");
        Latkes latke = new Latkes(1);
        for (String character : characters ) {
            latke.push(character);
        }
        String reverse = "";
        for (String character : characters ) {
            reverse += latke.pop();
        }
        return reverse;
    }


    /***
     * precondition:  s contains only the characters {,},(,),[,]
     * postcondition: allMatched( "({}[()])" )    -> true
     *                allMatched( "([)]" )        -> false
     *                allMatched( "" )            -> true
     **/
    public static boolean allMatched( String s )
    {
        if (s.length() == 0) {
            return true;
        }
        // Assume no spaces
        if (s.length() % 2 != 0) {
            return false;
        }
        else {
            String[] openers = {"{", "(", "["};
            String[] closers = {"}", ")", "]"};
            // Latkes is a stack
            Latkes latke = new Latkes(1);
            for (String character : s.split("")) {
                if (contains(openers, character)) {
                    latke.push(character);
                }
                else if (contains(closers, character)) {
                    if (latke.isEmpty()) {
                        return false;
                    }
                    else if (latke.peek().equals(character)) {
                        latke.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
            return latke.isEmpty();
        }
    }


    //main method to test
    public static void main( String[] args )
    {
        System.out.println(flip("stressed"));
        System.out.println(allMatched( "({}[()])" )); //true
        System.out.println(allMatched( "([)]" ) ); //false
        System.out.println(allMatched( "(){([])}" ) ); //true
        System.out.println(allMatched( "](){([])}" ) ); //false
        System.out.println(allMatched( "(){([])}(" ) ); //false
        System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    }

}//end class