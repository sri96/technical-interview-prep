public class RemoveDuplicatesIISolution {

    public static void main(String[] args) throws Exception{
        int[] inputArray = {1, 1, 1, 2, 2, 2, 3, 4, 4};
        System.out.println(new RemoveDuplicatesIISolution().removeDuplicates(inputArray));
    }

    public int removeDuplicates(int[] inputArray) {
        if(inputArray.length == 0) return 0;
        int innerLoopVariable = 0;
        int count = 1;
        for(int loopVariable = 1; loopVariable < inputArray.length; loopVariable++){
            if(inputArray[loopVariable - 1] == inputArray[loopVariable]){
                count ++;
            } else{
                count = 1;
            }
            if(count == 1 || count == 2){
                innerLoopVariable++;
                inputArray[innerLoopVariable] = inputArray[loopVariable];
            }
        }
        return innerLoopVariable + 1;
    }

}