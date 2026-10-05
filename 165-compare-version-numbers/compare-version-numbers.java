class Solution {
    public int compareVersion(String version1, String version2) {
        

        int v1p1=0;
        int v1p2=0;

        int v2p1=0;
        int v2p2=0;

        while(v1p2<version1.length() && v2p2<version2.length()){
            
            while(v1p2<version1.length() && version1.charAt(v1p2)!='.'){
                v1p2++;
            }

            while(v2p2<version2.length() && version2.charAt(v2p2)!='.'){
                v2p2++;
            }

            int num1=Integer.parseInt(version1.substring(v1p1, v1p2));
            int num2=Integer.parseInt(version2.substring(v2p1, v2p2));

            if(num1<num2) return -1;
            if(num1>num2) return 1;

            v1p1=v1p2+1;
            v1p2=v1p1;
            v2p1=v2p2+1;
            v2p2=v2p1;


        }

        while(v1p2<version1.length() ){
             while(v1p2<version1.length() && version1.charAt(v1p2)!='.'){
                v1p2++;
            }
            
            int num1=Integer.parseInt(version1.substring(v1p1, v1p2));
            int num2=0;
            if(num1<num2) return -1;
            if(num1>num2) return 1;


             v1p1=v1p2+1;
            v1p2=v1p1;


        }


         while(v2p2<version2.length() ){
             while(v2p2<version2.length() && version2.charAt(v2p2)!='.'){
                v2p2++;
            }
            
            int num1=0;
             int num2=Integer.parseInt(version2.substring(v2p1, v2p2));
            if(num1<num2) return -1;
            if(num1>num2) return 1;


            v2p1=v2p2+1;
            v2p2=v2p1;


        }



        // while()


        return 0;
    }
}