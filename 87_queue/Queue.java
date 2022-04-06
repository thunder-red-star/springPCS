/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<QUASAR>
{
<<<<<<< HEAD
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
=======
    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public QUASAR dequeue();

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( QUASAR x );

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the first element of the queue without dequeuing it.
    public QUASAR peekFront();
    //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
>>>>>>> 7da1ee387182d22da86010aa0639604ea004f826
