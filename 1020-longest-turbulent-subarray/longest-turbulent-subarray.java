class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        // true for greater 
        // false  for smaller

        int size=1;
        boolean sign=false;

        if(arr.length==1) return 1;

        if(arr[1]>arr[0]) sign=true;
        else sign=false;

        int window=1;

        int right=1;
        while(right<arr.length){

            if (arr[right] == arr[right - 1]) {
                window = 0;
                right++;
                continue;
            } 

            boolean currsign=arr[right]>arr[right-1];


            if(currsign==sign){

                size=Math.max(size, window+1);
                sign=currsign;
                window=1;
            }else if(currsign!=sign){
                window++;
                sign = currsign;
                
            }

           
            size=Math.max(size, window+1);

            right++;
        }

        return size;
    }
}
// class Solution {
//     public int maxTurbulenceSize(int[] arr) {

//         if (arr.length == 1) {
//             return 1;
//         }

//         int size = 1;
//         int window = 0;
//         boolean sign = false;
//         int right = 1;

//         while (right < arr.length) {

//             if (arr[right] == arr[right - 1]) {
//                 window = 0;
//             } 
//             else {
//                 boolean currentSign = arr[right] > arr[right - 1];

//                 if (window == 0) {
//                     window = 1;
//                 } 
//                 else if (currentSign != sign) {
//                     window++;
//                 } 
//                 else {
//                     window = 1;
//                 }

//                 sign = currentSign;
//                 size = Math.max(size, window + 1);
//             }

//             right++;
//         }

//         return size;
//     }
// }