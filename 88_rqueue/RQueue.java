/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
<<<<<<< HEAD
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {

  }


  public void enqueue( T enQVal )
  {

  }//O(?)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public T dequeue()
  {

  }//O(?)


  public T peekFront()
  {
    return _front.getValue();
  }//O(?)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   **/
  public void sample ()
  {

  }//O(?)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(?)


  // print each node, separated by spaces
  public String toString()
  {
    String foo = "";
    LLNode<SWASHBUCKLE> tmp = _front;
    while ( tmp != null ) {
      foo += tmp.getValue() + " ";
      tmp = tmp.getNext();
    }
    return foo;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    
    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing..."); 
=======
    //instance variables
    private LLNode<SWASHBUCKLE> _front, _end;
    private int _size;


    // default constructor creates an empty queue
    public RQueue()
    {
        _front = null;
        _end = null;
        _size = 0;
    }


    public void enqueue( SWASHBUCKLE enQVal )
    {
        LLNode<SWASHBUCKLE> newNode = new LLNode<SWASHBUCKLE>( enQVal );
        if ( isEmpty() )
        {
            _front = newNode;
            _end = newNode;
        }
        else
        {
            _end.setNext( newNode );
            _end = newNode;
        }
        _size++;
    }
    }//O(?)


    // remove and return thing at front of queue
    // assume _queue ! empty
    public SWASHBUCKLE dequeue()
    {
        SWASHBUCKLE retVal = _front.getValue();
        _front = _front.getNext();
        _size--;
        if ( isEmpty() )
            _end = null;
        return retVal;
    }//O(?)


    public SWASHBUCKLE peekFront()
    {
        return _front.getValue();
    }
    }//O(?)


    /***
     * void sample() -- a means of "shuffling" the queue
     * Algo:
     *   < YOUR SUCCINCT SUMMARY HERE >
     **/
    public void sample ()
    {
        // shuffle the queue
        for ( int i = 0; i < _size; i++ )
        {
            int rand = (int) ( Math.random() * _size );
            SWASHBUCKLE temp = dequeue();
            enqueue( temp );
        }
    }//O(?)


    public boolean isEmpty()
    {
        return _front == null;
    } //O(?)


    // print each node, separated by spaces
    public String toString()
    {
        String retStr = "";
        LLNode<SWASHBUCKLE> temp = _front;
        while ( temp != null )
        {
            retStr += temp.getValue() + " ";
            temp = temp.getNext();
        }
        return retStr.trim();
    }//end toString()



    //main method for testing
    public static void main( String[] args )
    {


    Queue<String> PirateQueue = new RQueue<String>();
    System.out.println("\nnow enqueuing...");
>>>>>>> 7da1ee387182d22da86010aa0639604ea004f826
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");
<<<<<<< HEAD

    System.out.println("\nnow testing toString()..."); 
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing..."); 
=======
    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...
    System.out.println("\nnow dequeuing...");
>>>>>>> 7da1ee387182d22da86010aa0639604ea004f826
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
<<<<<<< HEAD

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
=======
    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );

    }//end main

}//end class RQueue
>>>>>>> 7da1ee387182d22da86010aa0639604ea004f826
