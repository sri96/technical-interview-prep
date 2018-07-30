public class BattleshipsInABoardSolution {

    public static void main(String[] args) throws Exception {
        char[][] board = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        System.out.println(new BattleshipsInABoardSolution().countBattleships(board));
    }

    public int countBattleships(char[][] board) {
        int count = 0;
        for (int loopVariableI = 0; loopVariableI < board.length; loopVariableI++) {
            for (int loopVariableJ = 0; loopVariableJ < board[0].length; loopVariableJ++) {
                if (board[loopVariableI][loopVariableJ] == 'X') {
                    if (loopVariableI - 1 >= 0) { 
                        if (board[loopVariableI - 1][loopVariableJ] == 'X')
                            continue;
                    }
                    if (loopVariableJ - 1 >= 0) {
                        if (board[loopVariableI][loopVariableJ - 1] == 'X') {
                            continue;
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }

}