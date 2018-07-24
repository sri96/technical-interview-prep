public class RepeatedSubstringPatternSolution {
  
    public static void main(String[] args) throws Exception {
        System.out.println(new RepeatedSubstringPatternSolution().repeatedSubstringPattern("aaa"));
    }

    public boolean repeatedSubstringPattern(String string) {
        boolean found;
        for (int innerLoopVariable = 1, length = string.length(); innerLoopVariable < length; innerLoopVariable++) {
            found = true;
            String subInnerLoopVariable = string.substring(0, innerLoopVariable);
            int outerLoopVariable = innerLoopVariable;
            if (outerLoopVariable >= length) return false;
            while (outerLoopVariable < length) {
                if ((outerLoopVariable + innerLoopVariable) >= length + 1)
                    return false;
                String subOuterLoopVariable = string.substring(outerLoopVariable, outerLoopVariable + innerLoopVariable);
                if (!subInnerLoopVariable.equals(subOuterLoopVariable)) {
                    found = false;
                    break;
                }
                outerLoopVariable += innerLoopVariable;
            }
            if (found) return true;
        }
        return false;
    }
}