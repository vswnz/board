
/**
 * Write a really complex stuff
 * By Bill
 * To show multiple merges
 */
public class lines
{
    final int COL=5;
    final int ROW=4;
    int[][] board = new int[ROW][COL];
    public lines()
    {
        // show board
        for (int y=0;y<ROW-1;y++){
            for (int x=0;x<COL-1;x++)
                System.out.print(board[x][y]);
            System.out.println();
        }  // for y
    } // lines
} // class
