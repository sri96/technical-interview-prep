public class TwoKeysKeyboardSolution {

    public static void main(String[] args) throws Exception {
        System.out.println(new TwoKeysKeyboardSolution().minSteps(8));
    }

    public int minSteps(int input) {
        int[] solution = new int[input + 1];
        for (int innerLoopVariable = 2; innerLoopVariable <= input; innerLoopVariable++) {
            solution[innerLoopVariable] = innerLoopVariable;
            for (int outerLoopVariable = 2; outerLoopVariable < innerLoopVariable; outerLoopVariable++) {
                if ((innerLoopVariable % outerLoopVariable) == 0) {
                    solution[innerLoopVariable] = Math.min(solution[innerLoopVariable], solution[outerLoopVariable] + (innerLoopVariable / outerLoopVariable));
                }
            }
        }
        return solution[input];
    }

}