class Solution {
    public int maximumLengthSubstring(String s) {
        
        HashMap<Character, Integer> map=new HashMap<>();

        int left=0;
        int right=0;

        int len=0;
        while(right<s.length()){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), 1);
            }else{

                while(map.get(s.charAt(right))>=2){

                        map.put(s.charAt(left), map.get(s.charAt(left))-1);
                        if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
                        left++;
                    }


                if(map.get(s.charAt(right))<2){
                map.put(s.charAt(right), map.get(s.charAt(right))+1);
               
                

                // }else{
                    
                // }
            }
            }

            len=Math.max(len, right-left+1);
             right++;


        }
        return len;
    }
}