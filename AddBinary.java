import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Converter as strings binárias para BigInteger usando a base 2
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        
        // Somar os dois números
        BigInteger sum = num1.add(num2);
        
        // Retornar a representação binária do resultado
        return sum.toString(2);
    }
}
