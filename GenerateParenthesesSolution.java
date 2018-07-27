import java.util.*;

public class GenerateParenthesesSolution {
    public static void main(String[] args) throws Exception {
        System.out.println(new GenerateParenthesesSolution().generateParenthesis(5));
    }

    public List<String> generateParenthesis(int number) {
        List<String> list = new ArrayList<>();
        backTrack(list, "", 0, 0, number);
        return list;
    }

    private void backTrack(List<String> list, String str, int open, int close, int number) {
        if (str.length() == number * 2) {
            list.add(str);
        } else {
            if (open < number)
                backTrack(list, str.concat("("), open + 1, close, number);
            if (close < open) 
                backTrack(list, str.concat(")"), open, close + 1, number);
        }
    }
}