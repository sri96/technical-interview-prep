public class MoveZeorsToTheEndOfTheArray{
    public static void main(String [] args){
        int[] inputNumbers = {3, 0, 5, 6, 0, 2};
        int [] solution = new MoveZeorsToTheEndOfTheArray().moveZeros(inputNumbers);
        new MoveZeorsToTheEndOfTheArray().printArray(solution);
    }

    private void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
           if (i > 0) {
              System.out.print(", ");
           }
           System.out.print(anArray[i]);
        }
    }

    public int[] moveZeros(int[] inputNumbers){
        int outerIndexVariable = 0;
        int innerIndexVariable = 0;

        if(inputNumbers != null){
            while(innerIndexVariable < inputNumbers.length){
                if(inputNumbers[innerIndexVariable] == 0){
                    innerIndexVariable++;
                }
                else{
                    inputNumbers[outerIndexVariable] = inputNumbers [innerIndexVariable];
                    outerIndexVariable++;
                    innerIndexVariable++;
                }
            }
        }
        while(outerIndexVariable < inputNumbers.length){
            inputNumbers[outerIndexVariable] = 0;
            outerIndexVariable++;
        }
        return inputNumbers;
    }
}