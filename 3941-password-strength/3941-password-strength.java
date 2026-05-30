class Solution {
    public int passwordStrength(String password) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            set.add(password.charAt(i));
        }
        int point=0;
        for(Character s: set){
            if(Character.isLowerCase(s)){
                point+=1;
            }
            else if(Character.isUpperCase(s)){
                point+=2;
            }
            else if(Character.isDigit(s)){
                point+=3;
            }
            else{
                point+=5;
            }
        }
        return point;

    }
}