public class SortColorsSolution {

    public static void main(String[] args) throws Exception {
        int[] inputArray = {2, 1, 0, 0, 1};
        new SortColorsSolution().sortColors(inputArray);
        for (int loopVariable : inputArray)
            System.out.println(loopVariable);
    }

    public void sortColors(int[] inputArray) {
        int start = inputArray[0]; 
        inputArray[0] = 1; 
        int leftIndex = 0, rightIndex = 0; 
        for (int loopVariable = 1; loopVariable < inputArray.length; loopVariable++) {
            switch (inputArray[loopVariable]) {
                case 0:
                    inputArray[leftIndex] = 0;
                    inputArray[rightIndex + 1] = 1;
                    if (rightIndex + 1 != loopVariable) {
                        inputArray[loopVariable] = 2;
                    }
                    leftIndex++;
                    rightIndex++;
                    break;

                case 1:
                    inputArray[rightIndex + 1] = 1;
                    if (rightIndex + 1 != loopVariable) {
                        inputArray[loopVariable] = 2;
                    }
                    rightIndex++;
                    break;
            }
        }
       
        if (start == 0)
            inputArray[leftIndex] = 0;
        else if (start == 2)
            inputArray[rightIndex] = 2;
    }
}