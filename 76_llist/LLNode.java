/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
    //instance vars
    public String cargo;
    public LLNode next;
    // constructor
    public LLNode( String value, LLNode next )
    {
        this.cargo = value;
        this.next = next;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo()
    {
        return cargo;
    }

    public LLNode getNext()
    {
        return next;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo )
    {
        LLNode temp = new LLNode(this.cargo, this.next);
        this.cargo = newCargo;
        return newCargo;
    }

    public LLNode setNext( LLNode newNext )
    {
        LLNode temp = getNext();
        this.next = newNext;
        return newNext;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString()
    {
        return getCargo();
    }


    //main method for testing
    public static void main( String[] args )
    {

        //Below is an exercise in creating a linked list...

        //Create a node
        LLNode first = new LLNode( "cat", null );

        //Create a new node after the first
        first.setNext( new LLNode( "dog", null ) );

        //Create a third node after the second
        first.getNext().setNext( new LLNode( "cow", null ) );

        // Better traversal, doesn't garbage collect
        LLNode current = first;
        while ( current != null )
        {
            System.out.println( current.getCargo() );
            current = current.getNext();
        }
    }//end main

}//end class LLNode
