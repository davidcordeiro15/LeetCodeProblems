class Solution {
    public List<List<Integer>> generate(int numRows) {
        //matriz com o número de espaços corretos
        int pascalTriangle = new int[numRows][numRows];

        if (numRows > 2){

        }  else {
            for (int i = 0; i < numRows; i++){
                for (int j = 0; j < (numRows*numRows); j++){
                    if (j < i || i == j) {
                        //Só vai colocar o número 1 se j for menor que i
                        pascalTriangle[i][j] = 1;
                    }
                    
                }
            }
        }
    }
}
