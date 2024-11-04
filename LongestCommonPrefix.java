class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Começamos considerando que o prefixo comum é a primeira string
        String prefix = strs[0];

        // Iteramos sobre as demais strings
        for (int i = 1; i < strs.length; i++) {
            // Continuamos reduzindo o prefixo até ele ser comum a todas as strings
            while (strs[i].indexOf(prefix) != 0) {
                // Reduzimos o prefixo removendo o último caractere
                prefix = prefix.substring(0, prefix.length() - 1);
                // Se o prefixo se tornar vazio, não há prefixo comum
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
//.substring -> Retorna uma substring de uma string em um determinado intervalo dado
//.indexOf -> retorna a primeira posição em que a String dada aparece
