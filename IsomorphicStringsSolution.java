import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringsSolution{

    public static void main(String[] args) throws Exception{
        System.out.println(new IsomorphicStringsSolution().isIsomorphic("foo", "bar"));
        System.out.println(new IsomorphicStringsSolution().isIsomorphic("abc", "def"));
    }

    public boolean isIsomorphic(String inputString1, String inputString2) {
        if(inputString1.length() != inputString2.length()) return false;
        Map<Character, Character> first = new HashMap<>();
        Map<Character, Character> second = new HashMap<>();
        for(int innerLoopVariable = 0; innerLoopVariable < inputString1.length(); innerLoopVariable ++){
            char c = inputString1.charAt(innerLoopVariable);
            if(first.containsKey(c)){
                char secondC = first.get(c);
                if(inputString2.charAt(innerLoopVariable) != secondC) return false;
            } else{
                first.put(c, inputString2.charAt(innerLoopVariable));
                if(second.containsKey(inputString2.charAt(innerLoopVariable))) return false;
                second.put(inputString2.charAt(innerLoopVariable), c);
            }
        }
        return true;
    }

}