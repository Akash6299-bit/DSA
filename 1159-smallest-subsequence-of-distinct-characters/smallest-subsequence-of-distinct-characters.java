class Solution {
    public String smallestSubsequence(String s) {
        


        String ans="";

        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), i);
        }

        int maxchar=map.size();


        // HashMap<Character, Integer> map=new HashMap<>();
        Stack<Character> st=new Stack<>();


        for(int i=0; i<s.length();i++){
            // map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

            while(!st.isEmpty() && st.peek()>s.charAt(i) && i<map.get(st.peek())&& !st.contains(s.charAt(i))){
                st.pop();
            }
             
             if(st.isEmpty() || !st.contains(s.charAt(i))){
            st.push(s.charAt(i));
            
             }

            


        }

        while(st.size()>maxchar){
            st.pop();
        }

        StringBuilder anss=new StringBuilder();
        while(!st.isEmpty()){
            anss.append(st.pop());
        }

        return anss.reverse().toString();
    }
}