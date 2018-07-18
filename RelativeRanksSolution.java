import java.util.ArrayList;
import java.util.List;

public class RelativeRanksSolution {

    class Position{
        int score, poisition;
        Position(int score, int position){
            this.score = score;
            this.poisition = position;
        }
    }

    public static void main(String[] args) throws Exception{
        int[] inputArray = {1, 2, 3, 4, 5};
        String[] solution = new RelativeRanksSolution().findRelativeRanks(inputArray);
        for(String innerLoopVariable : solution){
            System.out.println(innerLoopVariable);
        }
    }

    public String[] findRelativeRanks(int[] inputNumbers) {
        String[] solution = new String[inputNumbers.length];
        List<Position> list = new ArrayList<>();
        for(int innerLoopVariable = 0; innerLoopVariable < inputNumbers.length; innerLoopVariable ++){
            list.add(new Position(inputNumbers[innerLoopVariable], innerLoopVariable));
        }
        list.sort((o1, o2) -> Integer.compare(o2.score, o1.score));

        for(int innerLoopVariable = 0; innerLoopVariable < list.size(); innerLoopVariable ++){
            if(innerLoopVariable == 0){
                solution[list.get(innerLoopVariable).poisition] = "Gold Medal";
            } else if(innerLoopVariable == 1){
                solution[list.get(innerLoopVariable).poisition] = "Silver Medal";
            } else if(innerLoopVariable == 2){
                solution[list.get(innerLoopVariable).poisition] = "Bronze Medal";
            }
            else {
                solution[list.get(innerLoopVariable).poisition] = String.valueOf(innerLoopVariable + 1);
            }
        }
        return solution;
    }

}