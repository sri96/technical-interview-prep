public class HouseRobberSolution {
    private int[] maximum;

    public static void main(String[] args) throws Exception {
        int[] nums = {1000, 2000, 3500, 200};
        System.out.println(new HouseRobberSolution().houseRobber(nums));
    }

    public int houseRobber(int[] nums) {
        if (nums.length == 0) return 0;
        maximum = new int[nums.length];
        if (nums.length == 1) return nums[0];
        maximum[nums.length - 1] = nums[nums.length - 1];
        maximum[nums.length - 2] = Math.max(nums[nums.length - 1], nums[nums.length - 2]);
        for (int innerLoopVariable = nums.length - 3; innerLoopVariable >= 0; innerLoopVariable--) {
            maximum[innerLoopVariable] = Math.max(maximum[innerLoopVariable + 1], nums[innerLoopVariable] + maximum[innerLoopVariable + 2]);
        }
        return maximum[0];
    }
}