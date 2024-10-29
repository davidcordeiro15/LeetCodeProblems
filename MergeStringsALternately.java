//Não resolvido ainda
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int maior;
        String word = ""; 
        if (word1.length() > word2.length()){
            maior = word1.length();
        } else {
            maior = word2.length();
        }
        for (int i = 0; i <= maior; i++){
            if (word1.charAt(i) == null){
                word = word + word2.charAt(i);
            } else if (word2.charAt(i) == null) {
                word = word + word1.charAt(i);
            } else {
                word = word + word1.charAt(i);
                word = word + word2.charAt(i);
            }
        }
        return word; 
    }
}
