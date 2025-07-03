class Solution {
    public char kthCharacter(int k) {
        String word = "a"; 
    
        if (k == 1) return 'a';  

        while (word.length() <= k)  {
            String newWord = ""; 
            for(int i=0; i < word.length(); i++) {
                String aux = String.valueOf( (char) (word.charAt(i) + 1));
                newWord = newWord + aux; 
            }
            word = word + newWord; 
        }
        return word.charAt(k-1); 
    }
}
