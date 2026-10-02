class Solution {
    public int rob(int[] nums) {

        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        
        int last=nums[0];
        int secondlast=0;
        int res=0;

        for(int i=1; i<nums.length; i++){
            
            res=Math.max(nums[i]+secondlast, last);
            secondlast=last;
            last=res;

        }
        return res;
    }
}