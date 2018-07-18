import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardFlipGameSolution {

    public static void main(String[] args) {
        int[] cardFront = {1,2,4,4,7};
        int[] cardBack = {1,3,4,1,3};
        System.out.println(new CardFlipGameSolution().flipgame(cardFront, cardBack));
    }

    public int flipgame(int[] cardFront, int[] cardBack) {
        List<Integer> inputNumbers = new ArrayList<>();
        for(int innerLoopVariable = 0; innerLoopVariable < cardFront.length; innerLoopVariable ++){
            inputNumbers.add(cardFront[innerLoopVariable]);
            inputNumbers.add(cardBack[innerLoopVariable]);
        }
        Collections.sort(inputNumbers);
        for(int number : inputNumbers){
            boolean success = true;
            for(int innerLoopVariable = 0; innerLoopVariable < cardFront.length; innerLoopVariable ++){
                if(number == cardFront[innerLoopVariable] && number == cardBack[innerLoopVariable]){
                    success = false;
                    break;
                }
            }
            if(success){
                return number;
            }
        }
        return 0;
    }

}