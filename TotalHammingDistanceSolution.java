public class TotalHammingDistanceSolution {

    public static void main(String[] args) throws Exception{
        int[] inputArray = {1000000000, 4, 14, 2};
        System.out.println(new TotalHammingDistanceSolution().totalHammingDistance(inputArray));
    }

    public int totalHammingDistance(int[] nums) {
        int sum = 0;
        for(int loopVariable = 0; loopVariable < 32; loopVariable ++){
            int numOfOnes = 0;
            int p = (1 << loopVariable);
            for (int num : nums) {
                if ((num & p) > 0) {
                    numOfOnes++;
                }
            }
            sum += ((nums.length - numOfOnes) * numOfOnes);
        }
        return sum;
    }
}