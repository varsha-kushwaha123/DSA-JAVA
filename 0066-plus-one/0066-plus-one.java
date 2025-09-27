class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        int carry=0;
        if(digits[n]<9){
            digits[n]+=1;

        }
        else{
            if(digits[n]>=9){
                digits[n]=0;
                carry=1;
            }
            for(int i=n-1;i>=0;i--){
                if(digits[i]+carry >9){
                    digits[i]=0;
                    carry=1;
                }
                else{
                    digits[i]=digits[i]+carry;
                    carry=0;
                    break;
                }


            }
            

        }
        if(carry==1){
            int arr[]=new int[n+2];
            for(int j=n;j>0;j--){
                arr[j]=digits[j];
            }
            arr[0]=1;
            return arr;
        }
        return digits;
    }
}