public class RotateArraySolution {

    public static void main(String[] args) throws Exception {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        new RotateArraySolution().rotate(inputArray, 2);
        for (int loopVariable : inputArray)
            System.out.print(loopVariable + " ");
    }

    public void rotate(int[] nums, int steps) {
        steps = steps % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, steps - 1);
        reverse(nums, steps, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        for (int loopVariableI = start, loopVariableJ = end; loopVariableI < loopVariableJ; loopVariableI++, loopVariableJ--) {
            int temp = nums[loopVariableI];
            nums[loopVariableI] = nums[loopVariableJ];
            nums[loopVariableJ] = temp;
        }
    }

}