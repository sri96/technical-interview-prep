import java.util.*;

public class ThreeSumClosestSolution {

    public static void main(String[] args) {
        int[] inputArray = {-1, 2, 1, -4};
        System.out.println(new ThreeSumClosestSolution().threeSumClosest(inputArray, 1));
    }

    public int threeSumClosest(int[] inputArray, int target) {
        Arrays.sort(inputArray);
        int min = Integer.MAX_VALUE, answer = -1;
        for (int loopVariableI = 0, length = inputArray.length; loopVariableI < length - 2; loopVariableI++) {
            if (loopVariableI == 0 || !(inputArray[loopVariableI] == inputArray[loopVariableI - 1])) {
                int loopVariableJ = loopVariableI + 1, loopVariableK = length - 1;
                while (loopVariableK > loopVariableJ) {
                    if (loopVariableJ != loopVariableI + 1 && (inputArray[loopVariableJ] == inputArray[loopVariableJ - 1])) {
                        loopVariableJ++;
                        continue;
                    }
                    int sum = inputArray[loopVariableI] + inputArray[loopVariableJ] + inputArray[loopVariableK];
                    if (sum < target) {
                        int diff = Math.abs(sum - target);
                        if (diff < min) {
                            min = diff;
                            answer = sum;
                        }
                        loopVariableJ++;
                    } else if (sum > target) {
                        int diff = Math.abs(sum - target);
                        if (diff < min) {
                            min = diff;
                            answer = sum;
                        }
                        loopVariableK--;
                    } else {
                        return sum;
                    }
                }
            }
        }
        return answer;
    }
}