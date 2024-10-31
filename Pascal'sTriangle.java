class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // O primeiro e o último elemento da linha são sempre 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Outros elementos são a soma dos dois elementos acima dele
                    row.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
                }
            }
            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }
}
