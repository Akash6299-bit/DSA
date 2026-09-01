import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {


        int[][] arr=new int[nums.length][2];

        for(int i=0; i<nums.length; i++){

            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
            
        Arrays.sort(arr, (a, b)->a[0]-b[0]);

  int left=0;
  int right=arr.length-1;


  while(left<right){

    int sum=arr[left][0]+arr[right][0];

    if(sum==target){
        return new int[]{arr[left][1], arr[right][1]};
    }else if(sum>target){
        right--;
    }else{
        left++;
    }
  }

  return new int[] {};

        // HashMap<Integer, Integer> map = new HashMap<>(); 
        // int[] arr=new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     int complement = target - nums[i];
        //     if (map.containsKey(complement)) {
                
        //         arr[0]=i;
        //         arr[1]=map.get(complement);
        //         return arr;
        //     }
        //     map.put(nums[i], i);
        // }

        // return arr;
        
    }
}