package ch09;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        matrix[0][1] = 10;
        matrix[1][2] = 20;

        int[][] matrix2 = {
                {10, 20, 30},
                {40, 50},
                {70, 80, 90}
        };

        for (int i=0; i < matrix2.length; i++) {
            for (int j=0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] matrix1 : matrix2) {
            for (int num : matrix1) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
