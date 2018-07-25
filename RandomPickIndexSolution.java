import java.util.*;

public class RandomPickIndexSolution {

    private int[] nums;

    public static void main(String[] args) throws Exception{
        int[] inputArray = {1,2,3,3,3};
        System.out.println(new RandomPickIndexSolution(inputArray).pick(1));
    }

    public RandomPickIndex(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        Random random = new Random();
        int nPick = 1 + random.nextInt(count);
        count = 0;
        for(int innerLoopVariable = 0; innerLoopVariable < nums.length; innerLoopVariable ++){
            if(nums[innerLoopVariable] == target){
                if(++count == nPick){
                    return innerLoopVariable;
                }
            }
        }
        return 0;
    }

}
