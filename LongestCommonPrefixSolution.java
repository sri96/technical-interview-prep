public class LongestCommonPrefixSolution {

    public static void main(String[] args) throws Exception{
        String[] inputArray = {"aaabbc", "aaa", "aadkd"};
        System.out.println(new LongestCommonPrefixSolution().longestCommonPrefix(inputArray));
    }

    public String longestCommonPrefix(String[] inputArray) {
        if(inputArray.length == 0) return "";
        String result = inputArray[0];
        for(int innerLoopVariable = 1; innerLoopVariable < inputArray.length; innerLoopVariable ++){
            String string = inputArray[innerLoopVariable];
            for(int outerLoopVariable = 0; outerLoopVariable < result.length(); outerLoopVariable++){
                if(outerLoopVariable >= string.length() || result.charAt(outerLoopVariable) != string.charAt(outerLoopVariable)) {
                    result = result.substring(0, outerLoopVariable);
                    break;
                }
            }
        }
        return result;
    }

}