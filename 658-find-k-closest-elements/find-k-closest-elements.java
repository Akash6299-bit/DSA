class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();

      if(x<arr[0]){

        int count=0;

        int p1=0;

        while(count<k && p1<arr.length){
            ans.add(arr[p1++]);
            count++;
        }
   Collections.sort(ans);
        return ans;

      }else if(x>arr[arr.length-1]){

        int count=0;

        int p1=arr.length-1;

        while(count<k && p1>=0){
            ans.add(arr[p1--]);
            count++;
        }
  Collections.sort(ans);
        return ans;

      }

      int index=-1;

      for(int i=0; i<arr.length; i++){

        if(arr[i]==x){
            index=i;
            break;
        }
      }
     

     int count=0;
     int left=-1;
     int right=-1;


     if(index==-1){

        for(int j=0; j<arr.length; j++){
            if(arr[j]>x){
                index=j;
                break;
            }
        }

        left=index-1;
        right=index;
     }else{
        left=index-1;
        right=index+1;
        for(int j=0; j<arr.length; j++){
            if(arr[j]==x){
                ans.add(arr[j]);
                count++;
                if(count==k)
                break;
            }
        }
     }

     while(count<k && left>=0 && right<arr.length){
            
            
            if(arr[left]==x){
                left--;
                continue;
            }
            if(arr[right]==x){
                right++;
                continue;
            }
            
            
            int dif1=x-arr[left];
            int dif2=arr[right]-x;
            
            
            if(dif1<dif2){
                ans.add(arr[left]);
                left--;
                count++;
            }else if(dif1>dif2){
                ans.add(arr[right]);
                right++;
                count++;
            }else{
                
                 ans.add(arr[left]);
                count++;
                left--;
            }
            
            
            
        }
        
        while(count<k && left<0){
            

            if(arr[right]==x){
                right++;
                continue;
            }
             ans.add(arr[right]);
             count++;
            right++;
        }
        
        while(count<k && right>=arr.length){

            if(arr[left]==x){
                left--;
                continue;
            }
             ans.add(arr[left]);
             count++;
            left--;
        }
        
        Collections.sort(ans);
        return ans;





    }
}