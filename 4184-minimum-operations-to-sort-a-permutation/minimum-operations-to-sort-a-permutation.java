class Solution {
    public int minOperations(int[] nums) {
        

        boolean inc=true;
        boolean dec=true;

        int zeroind=-1;
        for(int i=0; i<nums.length; i++){

            if(nums[i]==0){
                zeroind=i;
                break;
            } 
        }

        int n=nums.length;


       for (int i = 1; i < n; i++) {

            int prev = (zeroind + (i - 1)) % n;
            int curr = (zeroind + i) % n;

            if (nums[prev] > nums[curr]) {
                inc = false;
            }

            prev = (zeroind - (i - 1) + n) % n;
            curr = (zeroind - i + n) % n;

            if (nums[prev] > nums[curr]) {
                dec = false;
            }
        }

         int ans = Integer.MAX_VALUE;

        if (inc) {
            ans = Math.min(ans, zeroind);
            ans = Math.min(ans, n - zeroind + 2);
        }

        if (dec) {
            ans = Math.min(ans, zeroind + 2);
            ans = Math.min(ans, n - zeroind);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;


    }
}