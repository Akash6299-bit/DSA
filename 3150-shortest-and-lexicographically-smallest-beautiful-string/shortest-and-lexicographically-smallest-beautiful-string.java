class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
         
        String ans="";




        int count=0;

        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i)=='1') count++;
        // }

        // if(count>k) return "";

        // count=0;

        int left=0;
        int right=0;

        while(right<s.length()){

             if(s.charAt(right)=='1'){
                count++;
            }

           while(count>k){
             
             if(s.charAt(left)=='1'){
                count--;
             }
            left++;
            
           }

           if(count==k){

            while (s.charAt(left) == '0') {
                    left++;
                }


            String s1=s.substring(left, right+1);

            if(ans=="" || s1.length()<ans.length()){
                ans=s1;
            }else if(s1.length()==ans.length()){

                int num=s1.compareTo(ans);

                if(num<0){
                    ans=s1;

                }
            }
              

           }


           

            right++;
        }

        // if(ans.equals(s) )return "";

        return ans;
    }

}