public class QueenBoard{
  private int[][]board;
  public static void main(String[] args){
    QueenBoard b = new QueenBoard(4);
    b.addQueen(0,0);
    System.out.println(b.toStringDebug());
  }
  public QueenBoard(int size){
    board=new int[size][size];
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        board[i][j]=0;
      }
    }
  }
  private boolean addQueen(int r, int c){
    board[r][c]=-1;
    int s=board.length;
    for(int i=c+1;i<s;i++){
      board[r][i]=board[r][i]+1;
    }
    return false;
  }
  private boolean removeQueen(int r, int c){
    return false;
  }
  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *"""_ _ Q _
  *Q _ _ _
  *_ _ _ Q
  *_ Q _ _"""
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    return "";
  }
  private String toStringDebug(){
    String ans="";
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board[0].length;j++){
        ans+=board[i][j]+" ";
      }
      ans+="\n";
    }
    return ans;
  }
  /**
  *@return false when the board is not solveable and leaves the board filled with zeros;
  *        true when the board is solveable, and leaves the board in a solved state
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public boolean solve(){
    return false;
  }

  /**
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public int countSolutions(){
    return 0;
  }
}
