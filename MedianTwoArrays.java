import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Combina os dois arrays
        int[] list = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, list, 0, nums1.length); // Copia nums1 para list
        System.arraycopy(nums2, 0, list, nums1.length, nums2.length); // Copia nums2 para list

        // Ordena o array combinado
        Arrays.sort(list);

        // Calcula a mediana
        int n = list.length;
        if (n % 2 == 0) {
            // Se o número total de elementos for par, pega a média dos dois valores centrais
            return (list[n / 2 - 1] + list[n / 2]) / 2.0;
        } else {
            // Caso contrário, retorna o elemento central
            return list[n / 2];
        }
    }
}
