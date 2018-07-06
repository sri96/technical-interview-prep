
public class MissingNumberInArraySolution{
    
    public static void main(String [] args) throws Exception {
        int[] inputNumbers = {0, 1, 2, 4, 5};
        System.out.println(new MissingNumberInArraySolution().findMissingNumber(inputNumbers));
    }

    public int findMissingNumber(int[] inputNumbers){
        int missingNumber = inputNumbers.length; 
        if(inputNumbers != null){
        for (int outerIndexVariable = 0; outerIndexVariable < inputNumbers.length; outerIndexVariable++){
             missingNumber ^= outerIndexVariable ^ inputNumbers[outerIndexVariable];
         }
        }
         return missingNumber;
    }
}