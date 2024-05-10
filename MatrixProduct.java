    public class MatrixProduct {
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            int[] columnProducts = new int[matrix[0].length];

            for (int j = 0; j < matrix[0].length; j++) {
                int product = 1;
                for (int i = 0; i < matrix.length; i++) {
                    product *= matrix[i][j];
                }
                columnProducts[j] = product;
            }

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Product of column " + (j + 1) + ": " + columnProducts[j]);
            }
    }
    }