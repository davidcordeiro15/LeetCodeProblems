class Solution {
    public int romanToInt(String s) {
        char num; 
        char num2; 
        int sum = 0; // Inicializa sum
        for (int i = 0; i < s.length(); i++) {
            num = s.charAt(i);
            if (i + 1 < s.length()) { // Verifica se há um próximo caractere
                num2 = s.charAt(i + 1);
                if (num == 'I' && num2 == 'V') {
                    sum += 4;
                    i++; // Pula o próximo caractere
                    continue;
                }
                if (num == 'I' && num2 == 'X') {
                    sum += 9;
                    i++;
                    continue;
                }
                if (num == 'X' && num2 == 'L') {
                    sum += 40;
                    i++;
                    continue;
                }
                if (num == 'C' && num2 == 'M') {
                    sum += 900;
                    i++;
                    continue;
                }
            }
            // Adiciona o valor padrão para num
            switch (num) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum; 
    }
}
