/*import java.util.*; 
class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>(); 
        Map<Integer, Integer> hash = new HashMap<>(); 
        int j = 0; 

        for (int num : nums) {
            list.add(num);
        }
        
        for(int i = 0; i < list.size(); i++){
            if(hash.containsKey(list.get(i))){
                list.remove(i);
                i--; 
                j+=1;  
            } 
            hash.put(list.get(i), i);
            

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return j;
    }
}
*/
//O problema do código é que o valor de j não leva em consideração o número 0, passando um valor errado para arras com 2 números
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Caso o array esteja vazio

        int uniqueCount = 1; // Inicia com o primeiro elemento sendo único

        // Percorre o array a partir do segundo elemento
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) { // Se for um número novo
                nums[uniqueCount] = nums[i]; // Move o novo número para a posição única
                uniqueCount++;
            }
        }

        return uniqueCount; // Retorna o número de elementos únicos
    }
}
