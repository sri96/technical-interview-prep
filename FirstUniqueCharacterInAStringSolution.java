public class FirstUniqueCharacterInAStringSolution {
    int[] CHAR = new int[256];

    public static void main(String[] args) throws Exception {
        System.out.println(new FirstUniqueCharacterInAStringSolution().firstUniqueChar("loleetcode"));
    }

    public int firstUniqueChar(String string) {
        if (string == null || string.isEmpty()) return -1;

        for (int innerLoopVariable = 0, length = string.length(); innerLoopVariable < length; innerLoopVariable++)
            CHAR[string.charAt(innerLoopVariable)]++;

        for (int innerLoopVariable = 0, length = string.length(); innerLoopVariable < length; innerLoopVariable++) {
            if (CHAR[string.charAt(innerLoopVariable)] == 1)
                return innerLoopVariable;
        }

        return -1;
    }
}