class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int count=0;
        List<Integer> l1=new ArrayList<>();

        Stack<Integer> st=new Stack<>();


        for(int i=0; i<arr.length; i++){

            // if(!st.isEmpty()){
                 st.push(arr[i]);
                 l1.add(arr[i]);
                Collections.sort(l1);

                boolean sta=true;

                for(int j=0; j<l1.size(); j++){
                      if(l1.get(j)!=j){
                        sta=false;
                        break;
                      }
                }

                 if(sta){
                    count++;
                    st.clear();
                 }
                
               


            }
        

        return count;
    }
}