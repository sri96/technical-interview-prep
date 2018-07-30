public class PourWaterSolution {

    public static void main(String[] args) throws Exception{
        int[] inputArray = {2, 1, 1, 2, 1, 2, 2};
        int[] result = new PourWaterSolution().pourWater(inputArray, 4, 3);
        for(int loopVariableI : result){
            System.out.print(loopVariableI + " ");
        }
    }

    public int[] pourWater(int[] heights, int units, int index) {
        while(units-- > 0){
            heights[index] += 1;
            int _index = index;
            int min = heights[index];
            for(int loopVariableI = index - 1; loopVariableI >= 0; loopVariableI--){
                if(heights[loopVariableI] + 1 > min){
                    break;
                } else if(heights[loopVariableI] + 1 < min){
                    min = heights[loopVariableI] + 1;
                    index = loopVariableI;
                }
            }
            if(_index == index){
                for(int loopVariableI = index + 1; loopVariableI < heights.length; loopVariableI++){
                    if(heights[loopVariableI] + 1 > min){
                        break;
                    } else if(heights[loopVariableI] + 1 < min){
                        min = heights[loopVariableI] + 1;
                        index = loopVariableI;
                    }
                }
            }
            if(_index != index){
                heights[index]--;
                heights[_index]++;
            }
        }
        return heights;
    }

}