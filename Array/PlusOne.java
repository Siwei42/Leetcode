package Array;
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0)
            return digits;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] + 1 > 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                break;
            }    
        }
        if(digits[0] == 0){
            int[] newdigits = new int[digits.length+1];
            newdigits[0] = 1;
            for(int i = 1; i < digits.length+1; i++){
                newdigits[i] = digits[i-1];
            }
            return newdigits;
        }
        return digits;
    }
}