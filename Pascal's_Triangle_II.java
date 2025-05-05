class Solution {
    public List<Integer> getRow(int rowIndex) {
        // int[] row = new int[rowIndex]; 
         
        List<List<Integer>> tri = new ArrayList<>(); 
        if (rowIndex == 0) {
            tri.get(0).add(1);
            return tri.get(0); 
        }
        
        for (int i = 0; i < rowIndex; i++ ) { // row
            tri.add([0]); 
            for(int y = 0; y < rowIndex + 1; y++){ // col
                if (y == 0 || y == rowIndex-1) { 
                    tri.get(i).add(1);
                } else {
                    tri.get(i).add(tri.get(i-1).get(y-1) + tri.get(i-1).get(y));
                }
                 
            }
        }            

        return tri.get(rowIndex); 
    }
}
