
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
        for (int y=0;y<ROW;y++){
            for (int x=0;x<COL;x++)
                System.out.print(board[x][y]);
            System.out.println();
        }
    
    // add a cruiser
    for (int i=2;i<=3;i++)
      board[2][i]=1; // 1 is a ship
        
        
    }

}
