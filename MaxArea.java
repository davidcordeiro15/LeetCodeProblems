class Solution {
    public int maxArea(int[] height) {
        int left = 0;                     // ponteiro no início
        int right = height.length - 1;    // ponteiro no final
        int maxArea = 0;

        // Enquanto os ponteiros não se cruzarem
        while (left < right) {
            // Altura limitada pela menor linha
            int minHeight = Math.min(height[left], height[right]);

            // Largura é a distância entre os ponteiros
            int width = right - left;

            // Calcula a área atual
            int currentArea = minHeight * width;

            // Atualiza a área máxima, se necessário
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            // Move o ponteiro que limita a altura:
            // Para tentar encontrar uma linha maior.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
