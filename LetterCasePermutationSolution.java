import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutationSolution {
    public static void main(String[] args) throws Exception {
        System.out.println(new LetterCasePermutationSolution().letterCasePermutation("cdB1c2z"));
    }

    public List<String> letterCasePermutation(String inputString) {
        List<String> result = new ArrayList<>();
        backtrack(inputString, result, 0, "");
        return result;
    }

    private void backtrack(String inputString, List<String> result, int index, String letter) {
        if (index == inputString.length()) {
            result.add(letter);
        } else {
            if (Character.isAlphabetic(inputString.charAt(index))) {
                backtrack(inputString, result, index + 1, letter + inputString.charAt(index));
                if (Character.isLowerCase(inputString.charAt(index))) {
                    backtrack(inputString, result, index + 1, letter + Character.toUpperCase(inputString.charAt(index)));
                } else {
                    backtrack(inputString, result, index + 1, letter + Character.toLowerCase(inputString.charAt(index)));
                }
            } else {
                backtrack(inputString, result, index + 1, letter + inputString.charAt(index));
            }
        }
    }
}