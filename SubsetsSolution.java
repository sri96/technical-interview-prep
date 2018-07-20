import java.util.ArrayList;
import java.util.List;

public class SubsetsSolution {

    public static void main(String[] args) throws Exception {
        int[] inputNumbers = {1, 2, 3};
        List<List<Integer>> solution = new SubsetsSolution().subsets(inputNumbers);
        System.out.println(solution);
    }

    public List<List<Integer>> subsets(int[] inputNumbers) {
        List<List<Integer>> solution = new ArrayList<>();
        solution.add(new ArrayList<>());
        for (int innerLoopVariable = 0, length = inputNumbers.length; innerLoopVariable < length; innerLoopVariable++) {
            for (int outerLoopVariable = 0, resLength = solution.size(); outerLoopVariable < resLength; outerLoopVariable++) {
                List<Integer> newList = new ArrayList<>(solution.get(outerLoopVariable));
                newList.add(inputNumbers[innerLoopVariable]);
                solution.add(newList);
            }
        }
        return solution;
    }

}