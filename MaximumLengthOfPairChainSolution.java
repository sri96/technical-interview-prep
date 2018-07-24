import java.util.*;

public class MaximumLengthOfPairChainSolution {

    public static void main(String[] args) throws Exception{
        int[][] inputPair = {{1,2}, {2,3}, {3,4}};
        System.out.println(new MaximumLengthOfPairChainSolution().findLongestChain(inputPair));
    }

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (o1, o2) -> o1[1] == o2[1] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]));
        int count = 1;
        int[] current = pairs[0];
        for(int innerLoopVariable = 1; innerLoopVariable < pairs.length; innerLoopVariable ++){
            if(pairs[innerLoopVariable][0] > current[1]){
                count++;
                current = pairs[innerLoopVariable];
            }
        }
        return count;
    }

}