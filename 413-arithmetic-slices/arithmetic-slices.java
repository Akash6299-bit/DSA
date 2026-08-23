class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length<3) return 0;


       
        int right=0;

        int dif=0;
        int cnt=0;
        int ans=0;

        while(right<nums.length-1){


            if(nums[right]-nums[right+1]!=dif){

                // if(cnt>=3-1){
                //     ans+=(cnt+1)-3+1;

                // }
                cnt=1;
                dif=nums[right]-nums[right+1];
            }else{
                cnt++;
                if(cnt>=3-1){
                    ans+=(cnt+1)-3+1;

                }
            }

            right++;
              

        }

        return ans;


    }
}