public class Main {
    public static void main(String[] args) {
        int sizeofmatrix = 4;
        int[][] matrix = new int[sizeofmatrix][sizeofmatrix];

        for (int i = 0; i < sizeofmatrix; i++) {
            matrix[i][i] = 1;
            matrix[i][sizeofmatrix - i - 1] = 1;
        }
        for (int i = 0; i < sizeofmatrix; i++) {
            for (int j = 0; j < sizeofmatrix; j++)
                System.out.printf("%d ", matrix[i][j]);
            System.out.print("\n");

        }
    }
}
