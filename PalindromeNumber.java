class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x); 
        if (x < 0){
            return false; 
        }
        for (int i = 0; i < num.length(); i++){ 
            if (num.charAt(i) != num.charAt(num.length()-i-1)){
                return false; 
            }
        }
        return true;
    }
}
