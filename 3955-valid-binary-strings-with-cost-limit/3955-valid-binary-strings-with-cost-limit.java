class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String>list=new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            String binary=Integer.toBinaryString(i);
            while(binary.length()<n){
                binary="0"+ binary;
            }
            int cost=0;
            boolean valid=true; 
            for(int j=0;j<n;j++){
                if( j<n-1 && binary.charAt(j)=='1' && binary.charAt(j+1)=='1'){
                    valid=false;
                    break;
                }
                
                if(binary.charAt(j)=='1'){
                        cost+=j;
                    }
                
            }
            if( valid && cost<=k){
                list.add(binary);
            }

        }
        return list;
        
    }
}