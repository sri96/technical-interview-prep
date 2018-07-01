import java.util.HashMap;
import java.util.HashSet;


public class LongestSubstringSolution{
    public static void main(String [] args){
        String string = "aaabb";
        int lengthofSubstring = 3;
        System.out.println("Longest substring with at least " + lengthofSubstring + " repeating characters is: " + longestSubstring(string, lengthofSubstring));
    }

    public static int longestSubstring (String string, int lengthofSubstring){
        HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
        for (int outerIndexVariable = 0; outerIndexVariable < string.length(); outerIndexVariable++){
            char character = string.charAt(outerIndexVariable);
            if(charCounter.containsKey(character)){
                charCounter.put(character, charCounter.get(character)+1);
            }
            else{
                charCounter.put(character, 1);
            }
        }

        HashSet<Character> splitSet = new HashSet <Character>();
        for(char charcter: charCounter.keySet()){
            if(charCounter.get(charcter)<lengthofSubstring){
                splitSet.add(charcter);
            }
        }

        if(splitSet.isEmpty()){
            return string.length();
        }

        int maximum = 0;
        int outerIndexVariable = 0, innerIndexVariable = 0;
        while(innerIndexVariable<string.length()){
            char character = string.charAt(innerIndexVariable);
            if(splitSet.contains(character)){
                if(innerIndexVariable != outerIndexVariable){
                    maximum = Math.max(maximum, longestSubstring(string.substring(outerIndexVariable, innerIndexVariable), lengthofSubstring));
                }
                outerIndexVariable = innerIndexVariable + 1;
            }
            innerIndexVariable++;
        }
        if(outerIndexVariable != innerIndexVariable){
            maximum = Math.max(maximum, longestSubstring(string.substring(outerIndexVariable, innerIndexVariable), lengthofSubstring));
        }
        return maximum;
    }
}