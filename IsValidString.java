class Solution {
    public boolean isValid(String word) {
        word = word.toLowerCase(); 
        if (word.length() < 3) {
            return false; 
        }
        boolean resta = false;  
        boolean restc = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};


        for(int j=0; j<word.length(); j++) {
            if (!Character.isLetterOrDigit(word.charAt(j))) {
                return false; 
            }
        }

        for (int i=0; i<vowels.length; i++) {
            for(int j=0; j<word.length(); j++) {
                if (word.charAt(j) == vowels[i]) {
                    resta = true; 
                }
            }
        }
        for (int i=0; i<consonants.length; i++) {
            for(int j=0; j<word.length(); j++) {
                if (word.charAt(j) == consonants[i]) {
                    restc = true; 
                }
            }
        }

        if (resta && restc) {
            return true; 
        }
        return false; 
    }
}
