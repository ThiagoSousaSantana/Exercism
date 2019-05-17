import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Matrix {

    private int[][] matrix;
    private List<String> columns;
    private List<String> rows;

    Matrix(String matrixAsString) {
        stringToMatrix(matrixAsString);
    }

    int[] getRow(int rowNumber) {
        return this.matrix[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        var column = new int[rows.size()];

        for (int i = 0; i < rows.size(); i++)
            column[i] = Integer.parseInt(rows.get(i).split(" ")[columnNumber]);

       return column;
    }

    int getRowsCount() {
        return rows.size();
    }

    int getColumnsCount() {
        return columns.size();
    }

    private void stringToMatrix(String string){
        rows = Arrays.asList(string.split("\n"));
        this.matrix = new int[rows.size()][rows.get(0).split(" ").length];

        for(var i = 0; i <= rows.size() - 1; i++){
            columns = Arrays.asList(rows.get(i).split(" "));

            for (int i1 = 0; i1 <= columns.size() - 1; i1++)
                this.matrix[i][i1] = Integer.parseInt(columns.get(i1));
        }
    }
}
