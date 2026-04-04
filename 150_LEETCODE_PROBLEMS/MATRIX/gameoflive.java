class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int copy[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int live=countLive(board,i,j);
                //apply rules
                if(board[i][j]==1){
                    if(live<2 || live>3){
                        copy[i][j]=0;
                    }
                    else{
                        copy[i][j]=1;
                    }
                }
                else{
                    if(live==3){
                        copy[i][j]=1;
                    }
                }
            }
        }
        //copy back
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=copy[i][j];
            }
        }
    }
    private int countLive(int[][]board,int i ,int j){
        int count=0;
        for(int x=-1;x<=1;x++){
            for(int y=-1;y<=1;y++){
                if(x==0 && y==0) continue;

                int ni=x+i;
                int nj=y+j;
                if(ni>=0 && nj>=0 && ni<board.length && nj<board[0].length){
                    if(board[ni][nj]==1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
