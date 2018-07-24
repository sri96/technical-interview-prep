public class JumpGameSolution {
  
    public static void main(String[] args) throws Exception {
        int[] inputArray = {1, 2, 3, 0, 4};
        System.out.println(new JumpGameSolution().canJump(inputArray));
    }

    public boolean canJump(int[] inputArray) {
        if (inputArray.length == 0) return false;
        int min = inputArray.length - 1, max = inputArray.length - 1;
        for (int innerLoopVariable = inputArray.length - 2; innerLoopVariable >= 0; innerLoopVariable--) {
            if ((inputArray[innerLoopVariable] + innerLoopVariable) >= min)
                min = innerLoopVariable;
        }
        return (min == 0);
    }
}