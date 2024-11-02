class Solution {
    public int romanToInt(String s) {
        int sum = 0; // Inicializa a soma
        int prevValue = 0; // Valor do caractere anterior

        for (int i = s.length() - 1; i >= 0; i--) {
            char num = s.charAt(i);
            int currentValue = 0;

            // Define o valor do caractere atual
            switch (num) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }

            // Se o valor atual for menor que o valor anterior, subtrai
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            // Atualiza o valor anterior
            prevValue = currentValue;
        }

        return sum; 
    }
}
