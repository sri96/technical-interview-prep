public class PalindromicSubstringsSolution {

    public static void main(String[] args) {
        System.out.println(new PalindromicSubstringsSolution().countSubstrings("aaab"));
    }

    public int countSubstrings(String string) {
        boolean[][] T = new boolean[string.length()][string.length()];
        int count = string.length();
        for(int innerLoopVariable = 0, outerLoopVariable = 0; innerLoopVariable < T.length; innerLoopVariable ++, outerLoopVariable ++){
            T[innerLoopVariable][outerLoopVariable] = true;
        }

        for(int OuterLoopVariable = 1, col = string.length(); OuterLoopVariable < col; OuterLoopVariable++){
            for(int innerLoopVariable = 0, outerLoopVariable = OuterLoopVariable; innerLoopVariable < col && outerLoopVariable < col; innerLoopVariable++, outerLoopVariable++){
                if(OuterLoopVariable == 1){
                    if(string.charAt(innerLoopVariable) == string.charAt(outerLoopVariable)){
                        T[innerLoopVariable][outerLoopVariable] = true;
                        count++;
                    }
                } else{
                    if(string.charAt(innerLoopVariable) == string.charAt(outerLoopVariable) && T[innerLoopVariable + 1][outerLoopVariable - 1]){
                        T[innerLoopVariable][outerLoopVariable] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}