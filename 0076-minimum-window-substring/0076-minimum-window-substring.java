class Solution {
    public String minWindow(String s, String t) {
        int n=s.length(),m=t.length(),r=0,l=0,minlen=Integer.MAX_VALUE;
        int start=-1,count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(s.charAt(r))>0){
                    count=count+1;
                }
                map.put(ch,map.get(ch)-1);
        }
        while(count==m){
            if(r-l+1 <minlen){
                minlen=r-l+1;
                start=l;
            }
            char left=s.charAt(l);
            if(map.containsKey(left)){
                map.put(left,map.get(left)+1);
            
            
            if(map.get(left)>0){
                count--;
            }
        }
        l++;
        }

        r=r+1;
        }
        return start==-1 ? "":s.substring(start,start+minlen);

      


        
    }
}