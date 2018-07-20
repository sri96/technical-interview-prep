import java.util.ArrayList;
import java.util.List;

public class LetterPhoneNumberSolution {
    private String[] input_alpha = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) throws Exception {
        List<String> result = new LetterPhoneNumberSolution().letterCombinations("32");
        result.forEach(System.out::println);
    }

    private List<String> letterCombinations(String input) {
        if (input == null || input.isEmpty() || input.contains("1") || input.contains("0"))
            return new ArrayList<>();
        List<String> previous = new ArrayList<>();
        previous.add("");
        for (int i = input.length() - 1; i >= 0; i--) {
            String string = input_alpha[Integer.parseInt(String.valueOf(input.charAt(i)))];
            List<String> newList = new ArrayList<>();
            for (int j = 0, l = string.length(); j < l; j++) {
                for (String s : previous) {
                    s = string.charAt(j) + s;
                    newList.add(s);
                }
            }
            previous = newList;
        }
        return previous;
    }


}