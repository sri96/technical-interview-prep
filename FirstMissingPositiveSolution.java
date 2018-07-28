public class FirstMissingPositiveSolution {
    private int length;

    public static void main(String[] args) throws Exception {
        int[] inputArray = {1, 3, 5, 9};
        System.out.println(new FirstMissingPositiveSolution().firstMissingPositive(inputArray));
    }

    public int firstMissingPositive(int[] numbers) {
        length = numbers.length;
        for (int loopVariableI = 0; loopVariableI < length; loopVariableI++) {
            if (numbers[loopVariableI] > 0 && numbers[loopVariableI] <= length && numbers[loopVariableI] != loopVariableI + 1) {
                int v = numbers[loopVariableI];
                numbers[loopVariableI] = -1;
                replace(v, numbers);
            }
        }

        for (int loopVariableI = 0; loopVariableI < length; loopVariableI++) {
            if (numbers[loopVariableI] != loopVariableI + 1)
                return loopVariableI + 1;
        }

        return length + 1;
    }

    private void replace(int number, int[] numbers) {
        if (number > 0 && number <= length && number != numbers[number - 1]) {
            int v = numbers[number - 1];
            numbers[number - 1] = number;
            replace(v, numbers);
        }
    }
}