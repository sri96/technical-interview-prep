public class TwoSumIISolution {
    public static void main(String[] args) throws Exception {
        int[] inputArray = {2, 7, 11, 15};
        int[] result = new TwoSumIISolution().twoSum(inputArray, 9);
        for (int loopVariable : result)
            System.out.println(loopVariable);
    }

    public int[] twoSum(int[] numbers, int target) {
        int loopVariableI = 0, loopVariableJ = numbers.length - 1;
        while (loopVariableI < loopVariableJ) {
            int sum = (numbers[loopVariableI] + numbers[loopVariableJ]);
            if (sum == target) {
                int[] result = new int[2];
                result[0] = loopVariableI + 1;
                result[1] = loopVariableJ + 1;
                return result;
            } else if (sum < target)
                loopVariableI++;
            else loopVariableJ--;
        }
        return new int[2];
    }
}