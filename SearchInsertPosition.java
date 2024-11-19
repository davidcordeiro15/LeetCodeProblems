class Solution {
    public int searchInsert(int[] nums, int target) {
        int j = 0; 
        //Iremos fazer um loop que percorre em ordem decrecente analizando se o numero apontado é menor ou igual ao target 
        for (int i = nums.length - 1; i >= 0; i--){
            j = i; 
            if (nums[i] == target) {
                break; 
            } else if (nums[i] < target){    
                j = j + 1;
                break; 
            }  
        }
        return j;  
    }
}
