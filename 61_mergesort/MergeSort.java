/***
 class MergeSort
 Implements mergesort on array of ints.
 Summary of Algorithm:
 ***/

public class MergeSort
{
    // Merge two sorted arrays, the output should be sorted.
    private static int[] merge( int[] a, int[] b )
    {
        int[] result = new int[a.length+b.length];

        // Initialize index values to 0 and the result array
        int ai = 0;
        int bi = 0;
        int ri = 0;

        // While both arrays have elements, compare the elements and add the smaller one to the result array
        while( ai < a.length && bi < b.length )
        {
            if( a[ai] < b[bi] )
                result[ri++] = a[ai++];
            else
                result[ri++] = b[bi++];
        }

        // If there are elements left in the first array, add them to the result array
        while( ai < a.length )
            result[ri++] = a[ai++];

        // If there are elements left in the second array, add them to the result array
        while( bi < b.length )
            result[ri++] = b[bi++];

        return result;
    }


    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr )
    {
        //base case: if the array has 1 or 0 elements, it is already sorted
        if( arr.length <= 1 )
            return arr;

        //otherwise, split the array into two halves
        int[] left = new int[arr.length/2];

        //copy the left half of the array into the left array
        for( int i = 0; i < left.length; i++ )
            left[i] = arr[i];

        //sort the left array
        left = sort( left );

        //copy the right half of the array into the right array
        int[] right = new int[arr.length-left.length];
        for( int i = 0; i < right.length; i++ )
            right[i] = arr[i+left.length];

        //sort the right array
        right = sort( right );

        //merge the two sorted arrays
        return merge( left, right );
    }



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
        for( int i = 0 ; i<a.length; i++ )
            a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
        System.out.print("[");
        for( int i = 0; i < a.length - 1; i++ ) {
            System.out.print( a[i] + ", " );
        }
        System.out.print(a[a.length - 1]);
        System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args )
    {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};
      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );
      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );
      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
    }
}