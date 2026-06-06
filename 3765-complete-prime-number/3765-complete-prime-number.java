class Solution { 
    public boolean completePrime(int num) {
        String s=Integer.toString(num);
        for(int i=1;i<=s.length();i++){
           String prefix=s.substring(0,i); 
             
            if(!isprime(prefix)){
                return false;
            }
        }
        for(int i=0;i<s.length();i++){
           String suffix=s.substring(i); 
             
            if(!isprime(suffix)){
                return false;
            }
        }

        return true;        
 } 
 private boolean isprime(String x){ 
    if(x.equals("")) return false; 
    int y=Integer.parseInt(x);
     if(y<2) return false;
      for(int i=2;i*i<=y;i++){
         if(y%i==0){
            return false;
          }
        } 
           
        return true;
    }
}