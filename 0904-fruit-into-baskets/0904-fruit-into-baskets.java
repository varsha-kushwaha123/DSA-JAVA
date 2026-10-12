class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0,r=0,maxsize=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            
                while(map.size()>2){
                    int val=map.get(fruits[l]);
                    val--;
                    if(val==0){
                        map.remove(fruits[l]);
                    }
                    else{
                        map.put(fruits[l],val);
                    }
                    l++;

                }
            
            if(map.size()<=2){
                maxsize=Math.max(maxsize,r-l+1);
            }
     
            r++;
            
        }
        return maxsize;
        
    }
}