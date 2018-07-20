public class BestTimeToBuyAndSellStocksSolution {

    public static void main(String[] args) throws Exception {
        int[] prices = {7, 1, 5, 3, 1};
        System.out.println(new BestTimeToBuyAndSellStocksSolution().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] max = new int[prices.length];
        max[prices.length - 1] = prices[prices.length - 1];
        for (int innerLoopVariable = prices.length - 2; innerLoopVariable >= 0; innerLoopVariable--) {
            max[innerLoopVariable] = Math.max(prices[innerLoopVariable], max[innerLoopVariable + 1]);
        }
        int result = Integer.MIN_VALUE;
        for (int innerLoopVariable = 0, length = max.length; innerLoopVariable < length; innerLoopVariable++) {
            result = Math.max(result, max[innerLoopVariable] - prices[innerLoopVariable]);
        }
        return result;
    }
}