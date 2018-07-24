public class RotateFunctionSolution {
   
    public static void main(String[] args) throws Exception {
        int[] inputArray = {4, 3, 2, 6};
        System.out.println(new RotateFunctionSolution().maxRotateFunction(inputArray));
    }

    public int maxRotateFunction(int[] inputArray) {
        if (inputArray.length == 0 || inputArray.length == 1) return 0;
        int max = Integer.MIN_VALUE;
        int length = inputArray.length;
        int sum = 0, prodSum = 0;
        for (int innerLoopVariable = 0; innerLoopVariable < length; innerLoopVariable++) {
            prodSum += (inputArray[innerLoopVariable] * innerLoopVariable);
            sum += inputArray[innerLoopVariable];
        }
        max = Math.max(max, prodSum);
        for (int innerLoopVariable = 0; innerLoopVariable < length - 1; innerLoopVariable++) {
            prodSum = (prodSum - sum + inputArray[innerLoopVariable] + ((length - 1) * inputArray[innerLoopVariable]));
            max = Math.max(max, prodSum);
        }
        return max;
    }
}