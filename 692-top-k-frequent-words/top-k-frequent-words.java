class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> map=new HashMap<>();


        for(int i=0; i<words.length; i++){

            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }

        }

        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());


        // for(String s: map.keySet()){

        //     p.add(map.get(s));
        // }

        HashMap<Integer, ArrayList<String>> map1=new HashMap<>();


        for(String s: map.keySet()){

            if(map1.containsKey(map.get(s))){

                map1.get(map.get(s)).add(s);
            }else{

                map1.put(map.get(s), new ArrayList<String>());

                map1.get(map.get(s)).add(s);
            }
        }

         for(int s: map1.keySet()){

            p.add(s);
        }


        List<String> ans=new ArrayList<>();


        int index=0;

        while(index<k){


            int freq=p.remove();

            ArrayList<String> l1=map1.get(freq);

            if(l1.size()<2){
                ans.add(l1.get(0));
                index++;
            }else{

                Collections.sort(l1);

            for(int j=0; j<l1.size(); j++){
                
                if(index<k){
                    ans.add(l1.get(j));
                    index++;
                }
            }
            }
        }

        return ans;


    }
}