class Solution {

    
    int row=0;
    int col=0;
    int ans=0;
    public void find(int[][]grid, int m, int n, int remain, boolean[][] vist ){


       if(m<0 || m>=row || n<0 || n>=col){
        return;
       } 
       if(grid[m][n]==2) {

        if(remain==0) ans++;
        return;
       }
    //    if(m>=row || n>=col){
    //     return;
    //    }

       if(grid[m][n]==-1) return;

       if(vist[m][n]) return;

       vist[m][n]=true;


       find(grid, m, n+1, remain-1,vist);
       find(grid, m+1, n, remain-1,vist);
       find(grid, m, n-1, remain-1,vist);
       find(grid, m-1, n, remain-1,vist);

       vist[m][n]=false;

        
    }

    public int uniquePathsIII(int[][] grid) {
        
        int m=row=grid.length;
        int n=col=grid[0].length;
        row=grid.length;
        col=grid[0].length;
        boolean [][] vist=new boolean[m][n];
        

        ans=0;

        int totalcell=n*m;
        int count=0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                if(grid[i][j]==-1) count++;

            }
        }

        int remain=totalcell-count;

         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                if(grid[i][j]==1) {

                    // vist[i][j]=true;
                    // remain-=1;
                    find(grid, i,j, remain-1, vist);
                }

            }
        }

        return ans;

        
    }
}