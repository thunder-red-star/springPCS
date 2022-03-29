
/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

import java.util.*;

public class LatKtS {

    public static boolean contains(String[] array, String value) {
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
    public static String flip(String s) {
        String[] characters = s.split("");
        Latkes latke = new Latkes(1);
        for (String character : characters) {
            latke.push(character);
        }
        String reverse = "";
        for (String character : characters) {
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
    public static boolean allMatched(String s) {
        if (s.length() == 0) {
            return true;
        }
        // Assume no spaces
        if (s.length() % 2 != 0) {
            return false;
        } else {
            String[] openers = {"{", "(", "["};
            String[] closers = {"}", ")", "]"};

            Latkes latke = new Latkes(1);

            int parenthesisCount = 0;
            int bracketCount = 0;
            int braceCount = 0;

            for (int i = 0; i < s.length(); i++) {
                String character = s.substring(i, i + 1);
                // Openers
                if (character.equals("{")) {
                    latke.push("{");
                    braceCount++;
                } else if (character.equals("[")) {
                    latke.push("[");
                    bracketCount++;
                } else if (character.equals("(")) {
                    latke.push("(");
                    parenthesisCount++;
                    // Closers
                } else if (character.equals("}")) {
                    if (latke.pop().equals("{")) {
                        braceCount--;
                    }
                } else if (character.equals("]")) {
                    if (latke.pop().equals("[")) {
                        bracketCount--;
                    }
                } else if (character.equals(")")) {
                    if (latke.pop().equals("(")) {
                        parenthesisCount--;
                    }
                } else {
                    System.out.println("Passing character " + character + "as it is not a parenthesis");
                }

                // Escape early if there are more closer than openers
                if (braceCount < 0 || parenthesisCount < 0 || bracketCount < 0) {
                    return false;
                }
            }

            // All matched?
            if (braceCount == 0 && parenthesisCount == 0 && bracketCount == 0) {
                return true;
            } else {
                return false;
            }
        }
    }


    //main method to test
    public static void main(String[] args) {
        System.out.println(flip("stressed"));
        System.out.println(allMatched("({}[()])")); //true
        System.out.println(allMatched("([)]")); //false
        System.out.println(allMatched("(){([])}")); //true
        System.out.println(allMatched("](){([])}")); //false
        System.out.println(allMatched("(){([])}(")); //false
        System.out.println(allMatched("()[[]]{{{{((([])))}}}}")); //true
    }

}//end class