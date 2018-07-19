import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroesSolution {

    public static void main(String[] args) throws Exception {
        int[][] inputMatrix = {{0, 8, 7}, {9, 0, 8}, {9, 9, 0}};
        int [][] solution = new SetMatrixZeroesSolution().setZeroes(inputMatrix);
        new SetMatrixZeroesSolution().printArray(solution);
    }

    private void printArray(int[][] anArray) {
        for (int allLoopsVariable = 0; allLoopsVariable < anArray.length; allLoopsVariable++) {
            for (int currentRowLoopVariable = 0; currentRowLoopVariable < anArray[allLoopsVariable].length; currentRowLoopVariable++)
           System.out.print(anArray[allLoopsVariable][currentRowLoopVariable]+ "");
        }
    }

    public int[][] setZeroes(int[][] inputMatrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();
        int m = inputMatrix.length;
        int n = inputMatrix[0].length;
        for (int outerLoopVariable = 0; outerLoopVariable < m; outerLoopVariable++) {
            for (int innerLoopVariable = 0; innerLoopVariable < n; innerLoopVariable++) {
                if (inputMatrix[outerLoopVariable][innerLoopVariable] == 0) {
                    row.add(outerLoopVariable);
                    column.add(innerLoopVariable);
                }
            }
        }

        for (int r : row) {
            for (int innerLoopVariable = 0; innerLoopVariable < n; innerLoopVariable++) {
                inputMatrix[r][innerLoopVariable] = 0;
            }
        }

        for (int c : column) {
            for (int innerLoopVariable = 0; innerLoopVariable < m; innerLoopVariable++) {
                inputMatrix[innerLoopVariable][c] = 0;
            }
        }
        return inputMatrix;
    }
}