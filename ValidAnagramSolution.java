public class ValidAnagramSolution {
    private int[] S = new int[256];
    private int[] T = new int[256];

    public static void main(String[] args) throws Exception {
        System.out.println(new ValidAnagramSolution().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String string1, String string2) {
        if (string1.length() != string1.length()) return false;

        for (int innerLoopVariable = 0, length = string1.length(); innerLoopVariable < length; innerLoopVariable++) {
            S[string1.charAt(innerLoopVariable)]++;
        }

        for (int innerLoopVariable = 0, length = string2.length(); innerLoopVariable < length; innerLoopVariable++) {
            T[string2.charAt(innerLoopVariable)]++;
        }

        for (int innerLoopVariable = 0; innerLoopVariable < 256; innerLoopVariable++) {
            if (S[innerLoopVariable] != T[innerLoopVariable]) return false;
        }

        return true;
    }
}