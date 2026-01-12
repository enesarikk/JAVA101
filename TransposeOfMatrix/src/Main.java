public class Main {
    static void show(int[][] array) {
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{4, 7, 2, 1}, {3, 9, 8, 6}};

        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] newArray = new int[colCount][rowCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newArray[j][i] = matrix[i][j];
            }
        }
        show(matrix);
        System.out.println(">------------------------<");
        show(newArray);
    }
}