class Solution {
    public int jump(int[] nums) {
        if(nums.length<2 || nums[0]==0) return 0;

       int jump=0;
       int index=0;

       while(index<nums.length){


        int maxrange=-1;
        int jumpto=-1;

        for(int i=index+1; i<=Math.min(index+nums[index], nums.length-1); i++){

            int max=i+nums[i];


            if(i==nums.length-1){
                return jump+1;
            }

            if( max>maxrange){
                maxrange=max;
                jumpto=i;
            }
        }

        if(maxrange>=nums.length-1){
            return jump+2;
        }

        index=jumpto;
        jump++;
       }

       return jump;

        
    }
}