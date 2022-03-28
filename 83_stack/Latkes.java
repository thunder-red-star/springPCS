/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
 DISCO
 QCC
 **/


public class Latkes
{
    private String[] _stack;
    private int _stackSize;

    //constructor
    public Latkes( int initCapacity )
    {
        _stack = new String[initCapacity];
        _stackSize = 0;
    }


    //means of insertion
    public void push( String s )
    {
        if( _stackSize == _stack.length )
            resize( 2 * _stack.length );

        _stack[ _stackSize++ ] = s;
    }


    //means of removal
    public String pop( )
    {
        if( _stackSize == 0 )
            return null;

        String top = _stack[ --_stackSize ];
        _stack[ _stackSize ] = null; // set that element to null

        if( _stackSize > 0 && _stackSize == _stack.length / 4 )
            resize( _stack.length / 2 );

        return top;
    }


    //chk for emptiness
    public boolean isEmpty()
    {
        return _stackSize == 0;
    }


    //chk for fullness
    public boolean isFull()
    {
        return _stackSize == _stack.length;
    }


    public void resize ( int newSize ) {
        String[] temp = new String[newSize];
        for( int i = 0; i < _stackSize; i++ )
            temp[i] = _stack[i];
        _stack = temp;
    }


    //main method for testing
    public static void main( String[] args )
    {
        Latkes tastyStack = new Latkes(10);
        tastyStack.push("aoo");
        tastyStack.push("boo");
        tastyStack.push("coo");
        tastyStack.push("doo");
        tastyStack.push("eoo");
        tastyStack.push("foo");
        tastyStack.push("goo");
        tastyStack.push("hoo");
        tastyStack.push("ioo");
        tastyStack.push("joo");
        tastyStack.push("coocoo");
        tastyStack.push("cachoo");
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        System.out.println( tastyStack.pop() );
    }
}