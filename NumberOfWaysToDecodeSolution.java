public class NumberOfWaysToDecodeSolution {

    public static void main(String[] args) throws Exception {
        System.out.println(new NumberOfWaysToDecodeSolution().numberOfDecodings("3220"));
    }

    public int numberOfDecodings(String string) {
        if (string == null || string.isEmpty()) return 0;
        int[] dynamicProgramming = new int[string.length() + 2];
        dynamicProgramming[string.length()] = 1;
        dynamicProgramming[string.length() + 1] = 1;
        for (int innerLoopVariable = string.length() - 1; innerLoopVariable >= 0; innerLoopVariable--) {
            for (int outerLoopVariable = innerLoopVariable + 1; outerLoopVariable < innerLoopVariable + 3; outerLoopVariable++) {
                if (outerLoopVariable <= string.length()) {
                    String subString = string.substring(innerLoopVariable, outerLoopVariable);
                    if (!subString.startsWith("0")) {
                        int intVal = Integer.parseInt(subString);
                        if (intVal <= 26) {
                            dynamicProgramming[innerLoopVariable] += dynamicProgramming[outerLoopVariable];
                        }
                    }
                }
            }
        }
        return dynamicProgramming[0];
    }
}