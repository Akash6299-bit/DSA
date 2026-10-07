class Solution {
     public int find(int[]dp, String digits, int index){
        
       
        if(index==digits.length()){
            
            // cnt++;
            return 1;
            
        } 
        
        if(dp[index]!=-1) {
            // cnt++;
            return dp[index];
        }
        
        if(digits.charAt(index)=='0' ) return 0;
        
        
        
        int val=0;
         
        for(int i=index; i<digits.length(); i++){
            
            String s=digits.substring(index, i+1);
            
            if(s.charAt(0)=='0' || Integer.parseInt(s)>26){
                break;
                
                
            }
            
            val+=find(dp, digits, i+1);
            
            
        }
        return dp[index]= val;
    }
    public int numDecodings(String digits) {

         
        // cnt=0;
        
        int dp[]=new int [digits.length()+1];
        
        Arrays.fill(dp, -1);
         return find(dp,digits, 0);
        // return cnt;
        
    }
}