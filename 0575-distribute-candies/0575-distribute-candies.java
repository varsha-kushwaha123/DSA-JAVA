class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            map.add(candyType[i]);
        }
        int x=candyType.length;
        if(map.size()>(x/2)){
            return (x/2);
        }
        return map.size();
        
    }
}