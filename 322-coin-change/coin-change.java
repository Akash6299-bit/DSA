class Solution {

    // int ans=Integer.MAX_VALUE;


    public int find( int dp[][],int[] coins, int amount, int cursum,  int index){
       
       if(cursum==amount){
        // ans=Math.min(ans,curcombo[0]);
        return 0;
       }
       if (cursum > amount) {
    return Integer.MAX_VALUE;
}

       if(index>=coins.length){
        return Integer.MAX_VALUE;
       }
       if(dp[index][cursum]!=-1) return dp[index][cursum];

       int state=Integer.MAX_VALUE;
       for(int i=index; i<coins.length; i++){
        //   curcombo[0]++;
         if (coins[i] > amount - cursum) {
        continue;
    }
        int result= find(dp, coins, amount, cursum+coins[i],  i);
       if(result!=Integer.MAX_VALUE){
        state=Math.min(result+1, state );
       }

        // curcombo[0]--;
       }

       return dp[index][cursum]=state ;



        
    }
    public int coinChange(int[] coins, int amount) {

        // ans=Integer.MAX_VALUE;
        int curcombo[]={0};

        int[][]dp=new int[coins.length][amount+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j]=-1;
            }
        }
        int ans= find(dp, coins,amount, 0, 0);


        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}