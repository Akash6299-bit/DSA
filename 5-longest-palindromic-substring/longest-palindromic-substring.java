class Solution {
    public String longestPalindrome(String s) {
        int maxlen=0;
        String ans="";


        for(int i=0; i<s.length(); i++){

            int left=i;
            int right=i;

            while(left>=0 && right<s.length()){

                if(s.charAt(left)==s.charAt(right)){
                    if((right-left+1)>maxlen){

                        maxlen=right-left+1;

                        ans=s.substring(left,right+1);
                    }
                }else{
                       
                        break;
                    }
                left--;
                right++;
            }

            left=i;
            right=i+1;

            while(left>=0 && right<s.length()){
                 if(s.charAt(left)==s.charAt(right)){
                    if((right-left+1)>maxlen){

                        maxlen=right-left+1;

                        ans=s.substring(left,right+1);
                    }
                }else{
                       
                        break;
                    }
                left--;
                right++;
            }
        }

        return ans;
    }
}