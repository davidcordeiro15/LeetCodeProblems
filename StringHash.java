// This code is a HashMap exercise, so it was made with a HashMap. I know there are more efficient ways, but I wanted to make it this way.


public String stringHash(String s, int k) {
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ++ch, i++) {
            map.put(String.valueOf(ch), i);
        }
        
        int z = 0; 
        String result = ""; 
        for (int j=0; j<s.length()/k; j++) {
            int sum = 0;
            for (int y=0; y<k; y++) {
                 int x = map.get(Character.toString(s.charAt(z))); 
                 sum = sum + x;
                 z++;
            }
            int a = sum % 26; 
            for (char ch = 'a'; ch <= 'z'; ++ch) {
                if (map.get(Character.toString(ch)).equals(a)) {
                   result = result + Character.toString(ch);
                }
            }
        }

        return result; 
    }
