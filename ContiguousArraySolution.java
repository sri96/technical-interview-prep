import java.util.*;

public class ContiguousArraySolution {
   
    public static void main(String[] args) throws Exception{
        int[] inputArray = {1, 2};
        System.out.println(new ContiguousArraySolution().findMaxLength(inputArray));
    }

    public int findMaxLength(int[] inputArray) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        for(int innerLoopVariable = 0; innerLoopVariable < inputArray.length; innerLoopVariable ++){
            if(inputArray[innerLoopVariable] == 0){
                count--;
            } else count++;
            if(count == 0){
                max = Math.max(max, innerLoopVariable + 1);
            } else {
                if(map.containsKey(count)){
                    int index = map.get(count);
                    max = Math.max(max, innerLoopVariable - index);
                } else{
                    map.put(count, innerLoopVariable);
                }
            }
        }
        return max;
    }
}