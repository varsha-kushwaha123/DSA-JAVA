class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")|| token.equals("-")|| token.equals("*")|| token.equals("/")){
               int b= s.pop();
               int a =s.pop();
                if(token.equals("+")){
                    s.push(a+b);
                }
                if(token.equals("-")){
                    s.push(a-b);
                }
                if(token.equals("*")){
                    s.push(a*b);
                }
                if(token.equals("/")){
                    s.push(a/b);
                }
            }
            else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.peek();
    }
}