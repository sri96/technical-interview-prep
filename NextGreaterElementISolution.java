public class NextGreaterElementISolution {
public static void main(String[] args) throws Exception{
        int[] inputArrayI = {4,1,2};
        int[] inputArratII = {1,3,4,2};
        int[] solution = new NextGreaterElementISolution().nextGreaterElement(inputArrayI, inputArratII);
        new NextGreaterElementISolution().printArray(solution);
    }

    private void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
           if (i > 0) {
              System.out.print(", ");
           }
           System.out.print(anArray[i]);
        }
    }

    public int[] nextGreaterElement(int[] inputArrayI, int[] inputArratII) {
        int[] solution = new int[inputArrayI.length];
        for(int innerLoopVariable = 0; innerLoopVariable < inputArrayI.length; innerLoopVariable ++){
            int number = inputArrayI[innerLoopVariable];
            boolean found = false;
            int greaterNumber = 0;
            for(int outerLoopVariable = 0; outerLoopVariable < inputArratII.length; outerLoopVariable ++){
                if(inputArratII[outerLoopVariable] == number){
                    found = true;
                } if(found){
                    if(inputArratII[outerLoopVariable] > number){
                        greaterNumber = inputArratII[outerLoopVariable];
                        break;
                    }
                }
            }
            if(found){
                solution[innerLoopVariable] = greaterNumber;
            } else{
                solution[innerLoopVariable] = -1;
            }
        }
        return solution;
    }

}