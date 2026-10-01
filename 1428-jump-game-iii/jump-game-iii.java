class Solution {


    boolean st=false;
    public void find(boolean[] vist, int[]arr, int start){

        if(st) return;

        if(start>=arr.length || start<0 ||  vist[start]==true) return;

        if(arr[start]==0){
            st=true;
            return;
        }

        vist[start]=true;

        find(vist, arr, start-arr[start]);
        find(vist, arr, start+arr[start]);

        vist[start]=false;


    }

    
    public boolean canReach(int[] arr, int start) {
        st=false;
        boolean [] vist=new boolean[arr.length];

        find(vist, arr, start);
        return st;




    }
}