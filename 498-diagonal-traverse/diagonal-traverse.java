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
    public int[] findDiagonalOrder(int[][] mat) {

        int m=mat.length;
        int n=mat[0].length;

        int[] arr=new int[m*n];

        // String[] s1=new String[m+1];

        // StringBuilder[] s1=new StringBuilder[m+1];

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0; i<m+n-1; i++){
            list.add(new ArrayList<>());
        }
        

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                list.get(i+j).add(mat[i][j]);

                // if(s1[i+j]==null){
                //     StringBuilder snew=new StringBuilder();
                //     snew.append(mat[i][j]);
                // }else{
                //     s1[i+j].append(mat[i][j]);
                // }


            }
        }


        for(int i=1; i<list.size(); i++){
             if(i%2==0){
                rev(list.get(i));

             }
        }

         int  index=0;
        for(int i=0; i<list.size(); i++){
            for(int num: list.get(i)){
                arr[index]=num;
                index++;

            }
        }

return arr;

        
    }
}