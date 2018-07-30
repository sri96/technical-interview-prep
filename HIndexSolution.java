public class HIndexSolution {

    public static void main(String[] args) throws Exception{
        int[] inputArray = {3, 0, 6, 1, 5};
        System.out.println(new HIndexSolution().hIndex(inputArray));
    }

    public int hIndex(int[] citations) {
        int length = citations.length;
        int[] count = new int[length + 1];
        int[] S = new int[length + 1];
        for(int loopVariable = 0; loopVariable < citations.length; loopVariable ++){
            if(citations[loopVariable] > length){
                citations[loopVariable] = length;
            }
        }
        for (int citation : citations) {
            count[citation]++;
        }
        S[length] = count[length];
        for(int loopVariable = length - 1; loopVariable >= 0; loopVariable --){
            S[loopVariable] = count[loopVariable] + S[loopVariable + 1];
        }
        for(int loopVariable = length; loopVariable >= 0; loopVariable--){
            if(loopVariable <= S[loopVariable]){
                return loopVariable;
            }
        }
        return 0;
    }
}