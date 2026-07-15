class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        
        int[]answer=new int[2];
        Set<Integer>set=new HashSet();
        int sumA=0;
        int sumB=0;
        for(int i=0;i<a.length;i++){
            sumA+=a[i];

        }
        for(int i=0;i<b.length;i++){
            sumB+=b[i];
            set.add(b[i]);
        }
        int finalsum=(sumA +sumB)/2;
        for(int i=0;i<a.length;i++){
            int value=finalsum-sumA + a[i];
            if(set.contains(value)){
                answer[0]=a[i];
                answer[1]=value;
                return answer;
            }
        }
        return answer;

    }
}