public class QueenBoard{
  private int[][]board;
  public static void main(String[] args){
    QueenBoard b = new QueenBoard(4);
    b.addQueen(0,0);
    b.addQueen(1,0);
    b.removeQueen(0,0);
    b.removeQueen(1,1);
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
    if(board[r][c]==0){
      board[r][c]=-1;
      int s=board.length;
      int i=r+1;
      int j=c+1;
      while(i<s&&j<s){
        board[i][j]=board[i][j]+1;
        i++;
        j++;
      }
      i=r-1;
      j=c+1;
      while(i>-1&&j<s){
        board[i][j]=board[i][j]+1;
        i--;
        j++;
      }
      for(int k=c+1;k<s;k++){
        board[r][k]=board[r][k]+1;
      }
      return true;
    }
    return false;
  }
  private boolean removeQueen(int r, int c){
    if(board[r][c]==-1){
      board[r][c]=0;
      int s=board.length;
      int i=r+1;
      int j=c+1;
      while(i<s&&j<s){
        board[i][j]=board[i][j]-1;
        i++;
        j++;
      }
      i=r-1;
      j=c+1;
      while(i>-1&&j<s){
        board[i][j]=board[i][j]-1;
        i--;
        j++;
      }
      for(int k=c+1;k<s;k++){
        board[r][k]=board[r][k]-1;
      }
      return true;
    }
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
