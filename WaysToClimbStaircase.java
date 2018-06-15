public class WaysToClimbStaircase{

    public static void main(String[] args)throws Exception{
        int stairs = 4;
        System.out.println("Number of ways to climb " + stairs + " stairs is: " + countNumberOfWays(stairs));
    }

    private static int fibonacciCalculation(int number){
        if (number <= 1)
          return number;
        return fibonacciCalculation(number-1) + fibonacciCalculation(number-2);
    }

    private static int countNumberOfWays(int stairs){
        return fibonacciCalculation(stairs + 1);
    }
}