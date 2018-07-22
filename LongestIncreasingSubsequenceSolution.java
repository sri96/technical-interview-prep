public class LongestIncreasingSubsequenceSolution {
  
    public static void main(String[] args) throws Exception {
        int[] inputArray = {9, 8, 7, 6, 4, 5, 2, 18};
        System.out.println(new LongestIncreasingSubsequenceSolution().lengthOfLIS(inputArray));
    }

    public int lengthOfLIS(int[] inputArray) {
        if (inputArray.length == 0) return 0;
        int[] A = new int[inputArray.length];
        int max = Integer.MIN_VALUE;
        for (int outerLoopVariable = 0, length = inputArray.length; outerLoopVariable < length; outerLoopVariable++) {
            int lis = 1;
            for (int innerLoopVariable = 0; innerLoopVariable < outerLoopVariable; innerLoopVariable++) {
                if (inputArray[outerLoopVariable] > inputArray[innerLoopVariable])
                    lis = Math.max(lis, A[innerLoopVariable] + 1);
            }
            A[outerLoopVariable] = lis;
            max = Math.max(max, A[outerLoopVariable]);
        }
        return max;
    }
}