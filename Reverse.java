class Solution {
    public int reverse(int x) {
        String word = Integer.toString(x); 
        char[] nums = new char[word.length()]; 
        int y = 0; 

        if (x==0) return 0; 
        
        for(int i=word.length()-1; i>=0; i--) {
            if (x < 0) {
                if (i == 0) {
                    nums[0] = '-';
                } else {
                    nums[y+1] = word.charAt(i);
                }
            } else {
                nums[y] = word.charAt(i);
            }
            y++; 
        }
        String reverse = new String(nums); 
        try {
            return Integer.parseInt(reverse); 
        } catch (Exception ex) {
            return 0; 
        }
    }
}
