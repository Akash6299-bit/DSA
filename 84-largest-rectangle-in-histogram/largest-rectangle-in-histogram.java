class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> st=new Stack<>();

           int max=0;
        for(int i=0; i<heights.length; i++){

            if(st.isEmpty()){
                st.push(i);
            }else{

            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                 
                 int heig=st.pop();

                 int low=0;

                 if(st.isEmpty()) low=-1;
               else low=st.peek();
                int high=i;

                int wid=high-low-1;

                max=Math.max(max,heights[heig]*wid );
            }

            st.push(i);
            }
        }

        while(!st.isEmpty()) {

    int heig = st.pop();

    int low = st.isEmpty() ? -1 : st.peek();

    int high = heights.length;

    int wid = high - low - 1;

    max = Math.max(max, heights[heig] * wid);
}

        return max;
    }
}