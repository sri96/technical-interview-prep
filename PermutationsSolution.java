import java.util.*;

public class PermutationsSolution {

    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new PermutationsSolution().permute(nums);
        System.out.println(result);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        nextPermutation(0, nums, result);
        return result;
    }

    private void nextPermutation(int num, int[] nums, List<List<Integer>> result) {
        if (num == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums)
                list.add(n);
            result.add(list);
        } else {
            for (int loopVariableJ = num, length = nums.length; loopVariableJ < length; loopVariableJ++) {
                int temp = nums[loopVariableJ];
                nums[loopVariableJ] = nums[num];
                nums[num] = temp;
                nextPermutation(num + 1, nums, result);
                temp = nums[loopVariableJ];
                nums[loopVariableJ] = nums[num];
                nums[num] = temp;
            }
        }
    }
}