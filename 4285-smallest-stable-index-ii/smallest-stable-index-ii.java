class Solution {
    public int firstStableIndex(int[] nums, int k) {
       
       Stack<Integer> max=new Stack<>();
       Stack<Integer> min=new Stack<>();

       int maxa=Integer.MIN_VALUE;

    //    for(int i=0; i<nums.length; i++){
    //         if(max.isEmpty()){
    //             max.push(nums[i]);
    //             maxa=nums[i];
    //         }else{

    //             if(max.peek()<nums[i]){
    //                 max.push(nums[i]);
    //                 maxa=nums[i];
    //             }else{
    //                 max.push(max.peek());
    //             }
    //         }
    //    }

       int mina=Integer.MAX_VALUE;

       for(int i=nums.length-1; i>=0; i--){
           if(min.isEmpty()){
            min.push(nums[i]);
            mina=nums[i];
           }else{

            if(min.peek()>nums[i]){
                min.push(nums[i]);
                mina=nums[i];
            }else{
                min.push(min.peek());
            }
           }
       }


      int ans=-1;

      for(int i=0; i<nums.length; i++){

        if(max.isEmpty()){
                max.push(nums[i]);
                maxa=nums[i];
            }else{

                if(max.peek()<nums[i]){
                    max.push(nums[i]);
                    maxa=nums[i];
                }else{
                    max.push(max.peek());
                }
            }

        int maxele=max.peek();
        int minele=min.pop();

        int stable=maxele-minele;

        if(stable<=k){

            return i;

            // if(ans==-1)
            // ans=stable;
            // else
            // ans=Math.min(ans, stable);
        }
      }

      return ans;
    }
}