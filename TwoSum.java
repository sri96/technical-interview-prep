import java.util.ArrayList;
import java.util.List; 


public class TwoSum{

    public static void main(String[] args){
    int[] inputNumbers = {4, 6, 8, 9, 10};
    int[] indicesOfTwoNumbers = new TwoSum().twoSum(inputNumbers, 14);
    System.out.println(indicesOfTwoNumbers);
    }

public int [] twoSum(int[] numbers, int target){
    for(int number = 1; number < numbers.length; number++){
        for(int j = number + 1; j < numbers.length; j++){
            if (numbers[j] == target - numbers[number]) {
                return new int[] { number, j };
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
}