class Solution {
    public int[] plusOne(int[] digits) {
        int currDigit = digits.length -1;
        while(digits[currDigit] == 9){
            if(currDigit == 0){
                int[] newArray = new int[digits.length +1];
                newArray[0] =1;
                return newArray;
            }
            digits[currDigit] = 0;
            currDigit--;
        }
        digits[currDigit]++;
        return digits;
    }
}