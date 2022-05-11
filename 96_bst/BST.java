/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

// Import linked list class for toString()
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BST
{

  public static final String treeStringLastNode = "└── ";
  public static final String treeStringNode = "├── ";
  public static final String treeStringEmptyNode = "│   ";

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    if( _root == null )
    {
      _root = newNode;
    }
    else
    {
      insert( _root, newVal );
    }
  }

  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, int newVal )
  {
    // Must keep in mind this is a BST, so we must
    // make sure that the new node is inserted in the
    // correct place in the tree.
    if( newVal < stRoot.getValue() )
    {
      if( stRoot.getLeft() == null )
      {
        // System.out.println( "Inserting " + newVal + " to left of " + stRoot.getValue() );
        stRoot.setLeft( new TreeNode( newVal ) );
      }
      else
      {
        // System.out.println( "Going left of " + stRoot.getValue() );
        insert( stRoot.getLeft(), newVal );
      }
    }
    else
    {
      if( stRoot.getRight() == null )
      {
        // System.out.println( "Inserting " + newVal + " to right of " + stRoot.getValue() );
        stRoot.setRight( new TreeNode( newVal ) );
      }
      else
      {
        // System.out.println( "Going right of " + stRoot.getValue() );
        insert( stRoot.getRight(), newVal );
      }
    }
  }//end insert()


  /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
         TreeNode current = _root;
          while( current != null )
          {
              if( target < current.getValue() )
                  current = current.getLeft();
              else if( target > current.getValue() )
                  current = current.getRight();
              else
                  return current;
          }
          return null;
    }


    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
        // Traverse the tree and find the height
        // We can implement a height function on trees
        return height(_root);
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
        return numLeaves(_root);
    }

  //recursive helper for height()
  public int height( TreeNode stRoot )
  {
    if( stRoot == null )
    {
      return 0;
    }
    else
    {
      return 1 + Math.max( height( stRoot.getLeft() ), height( stRoot.getRight() ) );
    }
  }//end height()

  //recursive helper for numLeaves()
  public int numLeaves ( TreeNode stRoot )
  {
    if( stRoot == null )
    {
      return 0;
    }
    else if( stRoot.getLeft() == null && stRoot.getRight() == null )
    {
      return 1;
    }
    else
    {
      return numLeaves( stRoot.getLeft() ) + numLeaves( stRoot.getRight() );
    }
  }//end leaves()

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if( currNode != null )
    {
      System.out.print( currNode.getValue() + " " );
      preOrderTrav( currNode.getLeft() );
      preOrderTrav( currNode.getRight() );
    }
    else
    {
      return;
    }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if( currNode != null )
    {
      inOrderTrav( currNode.getLeft() );
      System.out.print( currNode.getValue() + " " );
      inOrderTrav( currNode.getRight() );
    }
    else
    {
      return;
    }
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if( currNode != null )
    {
      postOrderTrav( currNode.getLeft() );
      postOrderTrav( currNode.getRight() );
      System.out.print( currNode.getValue() + " " );
    }
    else
    {
      return;
    }
  }

  // Tree toString()
  public String toString()
  {
    // Failed attempt to make a tree string much like the `tree` command in Ubuntu (it won't display nodes in the correct order)
    String output = "";
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add( _root );
    int level = 0;
    while( !queue.isEmpty() )
    {
      int numNodes = queue.size();
      for( int i = 0; i < numNodes; i++ )
      {
        TreeNode currNode = queue.remove();
        if( currNode != null )
        {
          output += " ".repeat( level * 4 ) + ( i == numNodes - 1 ? "└── " : "├── " );
          if( currNode.getLeft() != null )
          {
            // System.out.println( currNode.getLeft().getValue() );
            queue.add( currNode.getLeft() );
          }
          if( currNode.getRight() != null )
          {
            queue.add( currNode.getRight() );
          }
          output += currNode.getValue() + "\n";
          if( queue.isEmpty() )
          {
            output += "    " + "\n";
          }
        }
        else
        {
          output += "│   " + "\n";
        }
      }
      level++;
    }
    return output;
  }

  // BetterToString()
  // A better toString that prints subtrees in the correct order
  public String betterToString()
  {
    // Use bTSHelper() to recurse through the tree
    // and print the subtrees in the correct order
    return bTSHelper( _root, 0, "" );
  }

  public String bTSHelper( TreeNode currNode, int level, String nodeSepStr )
  {
    String output = "";
    if( currNode != null ) {
      output += "│   ".repeat(level) + nodeSepStr + currNode.getValue() + "\n";
    }
    if( currNode.getLeft() != null )
    {
        if (currNode.getRight() != null)
        {
          output += bTSHelper( currNode.getLeft(), level + 1,  "├── " );
        }
        else
        {
          output += bTSHelper( currNode.getLeft(), level + 1,  "└── ");
        }
    }
      if( currNode.getRight() != null )
      {
        output += bTSHelper( currNode.getRight(), level + 1, "└── " );
      }
    return output;
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //main method for testing
  public static void main( String[] args )
  {
          BST x = new BST();
      x.insert( 16 );
      x.insert( 8 );
      x.insert( 20 );
      x.insert( 24 );
      x.insert( 4 );
      x.insert( 12 );
      x.insert( 25 );
      x.insert( 2 );
      System.out.println( x.toString() );
      System.out.println( x.betterToString() );
      System.out.println(x.numLeaves());
      System.out.println("...expecting 3");
      System.out.println(x.height());
      System.out.println("...expecting 3");
        }

}//end class
