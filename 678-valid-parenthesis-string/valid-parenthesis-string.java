class Solution {
    public boolean checkValidString(String s) {



        Stack<Integer> open=new Stack<>();

        Stack<Integer> star=new Stack<>();

        for(int i=0; i<s.length(); i++){

            char ch=s.charAt(i);

            if(ch=='('){
                open.push(i);
            }else if(ch==')' && !open.isEmpty()){
                open.pop();
            }else if(ch==')' && open.isEmpty() && !star.isEmpty()){

                star.pop();
            }else if(ch==')' && open.isEmpty() && star.isEmpty()){

                return false;
            }
            
            else if(ch == '*'){
                star.push(i);
            }
        }

          while(!open.isEmpty() && !star.isEmpty()){


            if(star.peek()>open.peek()){
                star.pop();
                open.pop();

            }else{
                return false;
            }


          }


        
        if(open.size()==0)
        return true;


        return false;
        
        // int netcount=0;
        // int countstar=0;
        
        
        // // for(int i=0;i<s.length(); i++){

        // //     if(netcount<0){

        // //         if(countstar>=Math.abs(netcount)){
                   
        // //             countstar-=Math.abs(netcount);
        // //             netcount=0;
        // //         }



        // //     }

        // //     if(s.charAt(i)=='('){
        // //         netcount++;
        // //     }else if(s.charAt(i)==')'){
        // //         netcount--;
        // //     }else{
        // //         countstar++;
        // //     }
        // // }
           
        // //    return netcount==0;
        
    }
}