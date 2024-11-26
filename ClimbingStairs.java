class Solution {
    public int climbStairs(int n) {
        
        int resultado = 0;
        int atual = 1; 
        int anterior = 0; 

        for (int i = 0; i < n ; i++){
            resultado = atual + anterior;
            anterior = atual;
            atual = resultado; 
        }

        return resultado; 
    }
}
