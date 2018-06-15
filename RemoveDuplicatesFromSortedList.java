public class RemoveDuplicatesFromSortedList{
    public static void main(String[] args) throws Exception {
        int[] inputNumbers = {1, 1, 2};
        int N = new RemoveDuplicatesFromSortedList().removeDuplicates(inputNumbers);
        for (int outerIndexVariable = 0; outerIndexVariable < N; outerIndexVariable++)
            System.out.print(inputNumbers[outerIndexVariable] + " ");
    }
    public int removeDuplicates(int[] inputNumbers) {
        int size = 1;
        if(inputNumbers != null){
        if (inputNumbers.length == 1) return 1;
        for (int innerIndexVariable = 0, outerIndexVariable = 1; outerIndexVariable < inputNumbers.length; outerIndexVariable++) {
            if (inputNumbers[outerIndexVariable] != inputNumbers[outerIndexVariable - 1]) {
                size++;
                innerIndexVariable++;
                inputNumbers[innerIndexVariable] = inputNumbers[outerIndexVariable];
            }
        }
    }
        return size;
}

}