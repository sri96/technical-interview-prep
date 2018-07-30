public class MaximumSwapSolution {

    public static void main(String[] args) throws Exception{
        System.out.println(new MaximumSwapSolution().maximumSwap(2736));
    }

    public int maximumSwap(int num) {
        int[] digits = new int[10];
        char[] character = String.valueOf(num).toCharArray();
        for(int loopVariable = 0; loopVariable < character.length; loopVariable++){
            digits[character[loopVariable] - '0'] = loopVariable;
        }

        boolean found = false;

        for(int loopVariable = 0; loopVariable < character.length; loopVariable++){
            int digit = character[loopVariable] - '0';
            for(int loopVariableJ = 9; loopVariableJ > digit; loopVariableJ--){
                if(digits[loopVariableJ] > loopVariable){
                    char temp = character[loopVariable];
                    character[loopVariable] = (char)(loopVariableJ + '0');
                    character[digits[loopVariableJ]] = temp;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        return Integer.parseInt(String.valueOf(character));
    }

}