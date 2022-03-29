
/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

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
        String reverse;
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
            
        }
    }


    //main method to test
    public static void main( String[] args )
    {
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }

}//end class