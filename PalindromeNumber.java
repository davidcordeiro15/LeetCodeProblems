class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x); 
        String[] charNum = new String[num.length()];
        int sum = 0; 
        for (int i = 0; i < charNum.length; i++){
            if (charNum[i].equals(charNum[charNum.length-i-1])){
                sum += 1; 
            }
        }
        if (sum == charNum.length) {
            return true; 
        } else {
            return false; 
        }
    }
}
