class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n]; 
        
        
        for (int i = 0; i < m; i++){
            nums[i] = nums1[i]; 
        }

        for (int j = 0; j < n; j++) {
            nums[m + j] = nums2[j];
        }
        
        Arrays.sort(nums);

        for (int z = 0; z < nums.length; z++){
            nums1[z] = nums[z]; 
        }
    }
}
