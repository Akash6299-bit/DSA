class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        if(nums.length==2) return Math.max(nums[0], nums[1]);
        
        int last=nums[0];
        int secondlast=0;
        int res=0;

        for(int i=1; i<nums.length-1; i++){
            
            res=Math.max(nums[i]+secondlast, last);
            secondlast=last;
            last=res;

        }

        last=nums[1];
        secondlast=0;
        int res2=0;
        for(int i=2; i<nums.length; i++){
            
            res2=Math.max(nums[i]+secondlast, last);
            secondlast=last;
            last=res2;
        }


        return Math.max(res, res2);
    }
}