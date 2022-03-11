//Clyde Sinclair
//APCS pd0
//HW72 -- QuickSort
//2022-03-09w
//time spent: _h

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr):
      
 *
 * 2a. Worst pivot choice and associated run time:
 *
 * 2b. Best pivot choice and associated run time:
 *
 * 3. Approach to handling duplicate values in array:
 *    consistently view as smaller
 **/

public class QuickSelect
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------




  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static int qselect( int[] d, int n )
  {
    qsorthelper(0,d.length -1 ,d);
    int res = d[(n-1)];
    return res;
  }

  //you may need a helper method...
  public static void qsorthelper (int low, int high, int[] arr) {
    if (low <= high) {
      int pivpoint = Partition.partition(arr, low, high, low);
      qsorthelper(low,pivpoint-1,arr);
      qsorthelper(pivpoint+1,high,arr);
    }
  }



  //main method for testing
  public static void main( String[] args )
  {

    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {17,4,5,9000,6};
    int[] arr5 = {3,0,16,599,1024};
    int[] arr6 = {7,1,5,12,3};
    int[] arr7 = {900, 800 , 700, 600 , 500};
    int[] arr8 = {2};

    System.out.println(" third smallest arr1; ");
    printArr(arr1);
    System.out.println(""+qselect(arr1,3));
    System.out.println("-----------------------");

    System.out.println(" second smallest arr3; ");
    printArr(arr3);
    System.out.println(""+qselect(arr3,2));
    System.out.println("-----------------------");

    System.out.println(" first smallest arr4; ");
    printArr(arr4);
    System.out.println(""+qselect(arr4,1));
    System.out.println("-----------------------");

    System.out.println(" fifth smallest arr5; ");
    printArr(arr5);
    System.out.println(""+qselect(arr5,5));
    System.out.println("-----------------------");



/*
    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);
    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);
    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;
    System.out.println("\narrN init'd to: " );
    printArr(arrN);
    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);
    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);
    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);
    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);
    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );
    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);
    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);
    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class QuickSort
