class Solution {
    public static void rev(List<Integer> temp){
        int left=0;
        int right=temp.size()-1;

        while(left<right){
            int val=temp.get(left);
            temp.set(left, temp.get(right));
            temp.set(right, val);
            left++;
            right--;
        }
    }
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        

        if(nums.size()==1){
            int[] arr=new int[nums.get(0).size()];
             int i=0;
            for(int num: nums.get(0)){
                arr[i++]=num;
            }
            return arr;
        }

        List<List<Integer>> list=new ArrayList<>();


        int max=0;
        for(int i=0; i<nums.size(); i++){
            int size=nums.get(i).size();
            max=Math.max(max, size);
        }

        for(int i=0; i<nums.size()+max-1; i++){
            list.add(new ArrayList<>());
        }
        

        for(int i=0; i<nums.size(); i++){
            for(int j=0; j<nums.get(i).size(); j++){

             Integer num=nums.get(i).get(j);
                if(num!=null){

                list.get(i+j).add(num);
                }

               

            }
        }


        for(int i=1; i<list.size()-1; i++){
            
                rev(list.get(i));

             
        }


   List<Integer> res=new ArrayList<>();
        
        for(int i=0; i<list.size(); i++){
            for(int num: list.get(i)){
                
                res.add(num);

            }
        }


 int index=0;
        int[] arr=new int[res.size()];
        for(int num: res){

            
            arr[index++]=num;

        }

return arr;

    }
}