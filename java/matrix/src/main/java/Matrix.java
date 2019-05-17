import java.util.Arrays;

class Matrix {

    private int[][] matrix;

    Matrix(String matrixAsString) {
        this.matrix = Arrays.stream(matrixAsString.split("\n"))
                .map(line -> Arrays.stream(line.split(" "))
                    .mapToInt(n -> Integer.parseInt(n))
                    .toArray())
                .toArray(int[][]::new);
    }

    int[] getRow(int rowNumber) {
        return this.matrix[rowNumber].clone();
    }

    int[] getColumn(int columnNumber) {
       return null;
    }
}
