public class CoinChangeSolution {
    private int[][] DynamicProgramming;

    public static void main(String[] args) throws Exception {
        int[] inputCoins = {1, 2, 5};
        System.out.println(new CoinChangeSolution().coinChange(inputCoins, 11));
    }

    public int coinChange(int[] inputCoins, int amount) {
        DynamicProgramming = new int[inputCoins.length][amount + 1];
        int result = dynamicProgramming(amount, 0, inputCoins);
        if (result == Integer.MAX_VALUE - 1) return -1;
        return result;
    }

    private int dynamicProgramming(int amount, int innerLoopVariable, int[] inputCoins) {
        if (amount == 0) return 0;
        else if (innerLoopVariable >= inputCoins.length || amount < 0) return Integer.MAX_VALUE - 1;
        if (DynamicProgramming[innerLoopVariable][amount] != 0) return DynamicProgramming[innerLoopVariable][amount];
        DynamicProgramming[innerLoopVariable][amount] = Math.min(1 + dynamicProgramming(amount - inputCoins[innerLoopVariable], innerLoopVariable, inputCoins), dynamicProgramming(amount, innerLoopVariable + 1, inputCoins));
        return DynamicProgramming[innerLoopVariable][amount];
    }
} 