public class GasStationSolution {
  
    public static void main(String[] args) throws Exception {
        int[] gas = {10, 20, 30, 10};
        int[] cost = {5, 30, 10, 10};
        System.out.println(new GasStationSolution().canCompleteCircuit(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int debt = 0, sum = 0, start = 0;
        for (int innerLoopVariable = 0; innerLoopVariable < gas.length; innerLoopVariable++) {
            sum += gas[innerLoopVariable] - cost[innerLoopVariable];
            if (sum < 0) {
                debt += sum;
                sum = 0;
                start = innerLoopVariable + 1;
            }
        }
        debt += sum;
        return debt >= 0 ? start : -1;
    }

}