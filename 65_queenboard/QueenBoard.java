/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

    private int[][] _board;

    public QueenBoard( int size )
    {
        _board = new int[size][size];
    }


    /***
     * precondition: board is filled with 0's only.
     * postcondition: 
     * If a solution is found, board shows position of N queens, 
     * returns true.
     * If no solution, board is filled with 0's, 
     * returns false.
     */
    public boolean solve()
    {
        int queenCount = 0;
        for (int i = 0; i < _board.length; i++) {
            solveH(i);
            if (solveH(i) == false) {
                _board = new int[_board.length][_board.length];
            }
        }
        return true;
    }


    /**
     *Helper method for solve. 
     */
    private boolean solveH( int col )
    {
        if( col == _board.length ) {
            return true;
        }
        for( int r = 0; r < _board.length; r++ ) {
            if( addQueen( r, col ) ) {
                boolean solved = solveH( col+1 );
                System.out.println(solved);
                if( solved && col == _board.length-1 ) {
                    return true;
                }
                removeQueen( r, col );
            }
        }
        return false;
    }


    public void printSolution()
    {
        /** Print board, a la toString...
         Except:
         all negs and 0's replaced with underscore
         all 1's replaced with 'Q'
         */
        
        String ans = "";
        for (int i = 0; i < _board.length; i++) {
            for (int j = 0; j < _board[0].length; j++) {
                if (_board[i][j] == 1) {
                    ans += "Q";
                }
                else {
                    ans += "_";
                }
                if (j != _board[0].length - 1) {
                    ans += "\t";
                }
            }
            ans += "\n";
        }
        System.out.println(ans);
    }



    //================= YE OLDE SEPARATOR =================

    /***
     * <General description>
     * precondition: 
     * postcondition: 
     */
    private boolean addQueen(int row, int col)
    {
        if(_board[row][col] != 0){
            return false;
        }
        _board[row][col] = 1;
        int offset = 1;
        while(col+offset < _board[row].length){
            _board[row][col+offset]--;
            if(row - offset >= 0){
                _board[row-offset][col+offset]--;
            }
            if(row + offset < _board.length){
                _board[row+offset][col+offset]--;
            }
            offset++;
        }
        return true;
    }


    /***
     * <General description>
     * precondition: 
     * postcondition: 
     */
    private boolean removeQueen(int row, int col){
        if ( _board[row][col] != 1 ) {
            return false;
        }
        _board[row][col] = 0;
        int offset = 1;

        while( col+offset < _board[row].length ) {
            _board[row][col+offset]++;
            if( row - offset >= 0 ) {
                _board[row-offset][col+offset]++;
            }
            if( row + offset < _board.length ) {
                _board[row+offset][col+offset]++;
            }
            offset++;
        }
        return true;
    }


    /***
     * <General description>
     * precondition: 
     * postcondition: 
     */
    public String toString()
    {
        String ans = "";
        for( int r = 0; r < _board.length; r++ ) {
            for( int c = 0; c < _board[0].length; c++ ) {
                ans += _board[r][c]+"\t";
            }
            ans += "\n";
        }
        return ans;
    }


    //main method for testing...
    public static void main( String[] args )
    {
        QueenBoard test = new QueenBoard( 5 );
        boolean solution = test.solve();
        System.out.println( "Were we able to solve the board? " + (solution ? "yes" : "no") );
        test.printSolution();
    }

}//end class