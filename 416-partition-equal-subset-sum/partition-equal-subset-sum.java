class Solution {
     public static boolean find (int[][]dp,int [] arr, int index, int sum, int cursum){
        
        // if(found) return false;
        if(index<=arr.length ){
            
            if(cursum==sum/2){
                // found=true;
                return true;
            }
        }
        if( index>=arr.length || cursum>sum/2) return false;
        
        
        
        if(dp[index][cursum]!=-1) return dp[index][cursum] == 1;;
        
        
        boolean st=false;
        for(int i=index; i<arr.length; i++){
            
            
            st=st || find(dp,arr, i+1, sum, cursum+arr[i]);
            if(st) break;
        }
        
        dp[index][cursum] = st ? 1 : 0;
        return st;
        
        
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
         if (sum % 2 != 0) return false;
         
         int[][]dp=new int[nums.length][ sum+1];
         
         for(int i=0; i<nums.length; i++){
             for(int j=0; j<=sum; j++){
                 dp[i][j]=-1;
             }
         }
        
         return find(dp,nums, 0, sum, 0);
    }
}