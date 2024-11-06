class Solution {
    public int[] twoSum(int[] nums, int target) {
       

        //Declarar o   Hash Map com duas variáveis
        Map<Integer, Integer> ids = new HashMap<>();

        //realizar o "for" procurando pelas keys do map 
        for (int i =0; i< nums.length; i++){
            //declarar variável para identificar a key
            int num = nums[i];
            //Verificar se o HashMap tem a key "num"
            /* Target é o valor que queremos encontrar ao somar dois elementos da lista, portanto, 
            o resultado entre target - num deve ser o valor que precisa estar na lista para completar a  soma valorQueFalta = target - num */
            if (ids.containsKey(target - num)){
                //iremos retornar uma lista com o número da posição dos valores que somados resultam no target. 
                //a posição "tal" irá armazenar o número "key"
                return new int[] {i, ids.get(target - num)}; 
            }
            ids.put(num, i); 
        }  
        return new int[] {}; 
    }
}
