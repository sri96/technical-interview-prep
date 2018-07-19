import java.util.ArrayList;
import java.util.List;

public class CombinationSumSolution {

    public static void main(String[] args) throws Exception {
        int[] inputCandidates = {2, 3, 6, 7};

        List<List<Integer>> solution = new CombinationSumSolution().combinationSum(inputCandidates, 7);
        System.out.print(solution);
    }

    public List<List<Integer>> combinationSum(int[] inputCandidates, int target) {
        List<List<Integer>> solution = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        doNext(0, solution, 0, inputCandidates, target, subList);
        return solution;
    }

    private void doNext(int i, List<List<Integer>> solution, int count, int[] inputCandidates, int target, List<Integer> subArr) {
        if (target == 0) {
            List<Integer> subList = new ArrayList<>();
            for (int innerLoopVariable = 0; innerLoopVariable < count; innerLoopVariable++)
                subList.add(subArr.get(innerLoopVariable));
            solution.add(subList);
        } else if (target > 0) {
            for (int j = i, l = inputCandidates.length; j < l; j++) {
                subArr.add(inputCandidates[j]);
                doNext(j, solution, count + 1, inputCandidates, target - inputCandidates[j], subArr);
                subArr.remove(subArr.size() - 1);
            }
        }
    }
}