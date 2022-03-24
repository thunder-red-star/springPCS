/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

/***
    DISCO
    QCC
    SUMMARY THE FIRST:
    SUMMARY THE SECOND:
**/




import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    boolean found = false;
    for( Integer i : L )
      if( i.equals(key) )
	found = true;
    return found;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    boolean found = false;
    Iterator<Integer> itr = L.iterator();
    while( itr.hasNext() )
      if( itr.next().equals(key) )
	found = true;
    return found;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    List<Integer> odds = new ArrayList<Integer>();
    for( Integer i : L )
      if( i % 2 != 0 )
    	odds.add(i);
    return odds;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    List<Integer> odds = new ArrayList<Integer>();
    Iterator<Integer> itr = L.iterator();
    while( itr.hasNext() ) {
      Integer value = itr.next();
      if( value % 2 == 1 )
    	odds.add(value);
    }
    return odds;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator<Integer> itr = L.iterator();
    while( itr.hasNext() )
      if( itr.next() % 2 == 0 )
	itr.remove();
  }


  public static void main( String [] args )
  {
    
    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();
    for( int i = 0; i < 10; i++ )
      L.add(i);
    // TASK: write code to print the contents of L...
    // a) using a FOREACH loop
    // b) explicitly using an iterator
    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );
    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );
    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);
    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);
    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    

  }//end main

}//end class ItrWork
