class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int n=strs.length;
        String pref=strs[0];
        int p=0;
        for(int i=0; i<n; i++){

            while(!strs[i].startsWith(pref)){

          pref=pref.substring(0, pref.length()-1);
           if(pref.isEmpty()) return "";
         }
        }
        return pref;
        
    }
}