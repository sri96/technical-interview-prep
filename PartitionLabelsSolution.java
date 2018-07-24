import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabelsSolution {

    public static void main(String[] args) throws Exception{
        System.out.println(new PartitionLabelsSolution().partitionLabels("abcs"));
    }

    public List<Integer> partitionLabels(String string) {
        if(string == null || string.trim().isEmpty()) return new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int innerLoopVariable = string.length() - 1; innerLoopVariable >= 0; innerLoopVariable--){
            char character = string.charAt(innerLoopVariable);
            map.putIfAbsent(character, innerLoopVariable);
        }
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int max = map.get(string.charAt(0));
        for(int innerLoopVariable = 0; innerLoopVariable < string.length(); innerLoopVariable++){
            char character = string.charAt(innerLoopVariable);
            if(map.get(character) > max){
                max = map.get(character);
            } else if(innerLoopVariable == max){
                result.add(max - start + 1);
                if(innerLoopVariable < string.length() - 1){
                    start = innerLoopVariable + 1;
                    max = map.get(string.charAt(innerLoopVariable + 1));
                }
            }
        }
        return result;
    }
}