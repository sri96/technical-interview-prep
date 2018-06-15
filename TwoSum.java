import java.util.ArrayList;
import java.util.List; 
import java.util.HashMap;


public class TwoSum{

    public static void main(String[] args){
    int[] inputNumbers = {4, 6, 8, 9, 10};
    int[] solution = new TwoSum().twoSum(inputNumbers, 14);
    new TwoSum().printArray(solution);
    }
private void printArray(int[] anArray) {
      for (int i = 0; i < anArray.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(anArray[i]);
      }
    }

public int [] twoSum(int[] inputNumbers, int target){
    if(inputNumbers != null){
        if(target != 0){
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int outerIndexVariable = 0; outerIndexVariable < inputNumbers.length; outerIndexVariable++) {
                int currentElementComplement = target - inputNumbers[outerIndexVariable];
                if (map.containsKey(currentElementComplement)) {
                    return new int[] { map.get(currentElementComplement), outerIndexVariable };
                }
                map.put(inputNumbers[outerIndexVariable], outerIndexVariable);
            }
}
}
throw new IllegalArgumentException("No two sum solution");
}
}