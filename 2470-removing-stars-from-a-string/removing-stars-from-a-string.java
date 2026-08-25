class Solution {
    public String removeStars(String s) {


        int i=0;
        StringBuilder ans=new StringBuilder();

        while(i<s.length()){

            if(s.charAt(i)=='*'){
                
                ans.deleteCharAt(ans.length()-1);
                i++;
                continue;
            }

            ans.append(s.charAt(i));
            i++;


        }

        return ans.toString();
        
        // Stack<Character> st=new Stack<>();
        // for(int i=0; i<s.length(); i++){
        //     if(!st.isEmpty() && s.charAt(i)=='*'){
        //         st.pop();
        //         continue;
        //     }

        //     st.push(s.charAt(i));
        // }

        // StringBuilder ans=new StringBuilder();

        // while(!st.isEmpty()){
        //     ans.append(st.pop());
        // }

        // return ans.reverse().toString();
    }
}