
    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
         TreeNode current = root;
          while( current != null )
          {
              if( target < current.data )
                  current = current.left;
              else if( target > current.data )
                  current = current.right;
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
        return height(root);
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
    	return numLeaves(root);
    }

