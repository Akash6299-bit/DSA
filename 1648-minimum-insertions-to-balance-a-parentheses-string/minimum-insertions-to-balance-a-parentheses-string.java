class Solution {
    public int minInsertions(String s) {
        
        Stack<Character> st=new Stack<>();

        
        int insertion=0;


        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)=='('){
                st.push('(');
                
            }

            if(!st.isEmpty() && s.charAt(i)==')'){

                while(i<s.length()-1 && !st.isEmpty() && s.charAt(i)==')' && s.charAt(i+1)==')'){
                    i+=2;
                    st.pop();
                }

                if(i<s.length()-1 && !st.isEmpty()&& s.charAt(i)==')' && s.charAt(i+1)!=')'){
                    
                    insertion++;
                    // i++;
                    st.pop();
                    continue;

                }

                if(i==s.length()-1 && s.charAt(i)==')' && !st.isEmpty()){

                    insertion++;
                    st.pop();
                    // i++;
                    continue;


                }
                i--;
                continue;

                

            }else if(st.isEmpty() && s.charAt(i)==')'){
                
                int unbalance=0;
                while(i<s.length() &&  s.charAt(i)==')'){

                    i++;
                    unbalance++;

                }

                if(unbalance%2==0){
                    insertion+=unbalance/2;
                    i--;
                    // continue;
                }else{

                    unbalance+=1;
                    insertion+=unbalance/2+1;
                    i--;
                    // continue;
                }

            }
        }
        while(!st.isEmpty()){

            st.pop();
            insertion+=2;
        }

        return insertion;
    }
}