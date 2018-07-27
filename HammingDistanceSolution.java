public class HammingDistanceSolution {

    public static void main(String[] args) throws Exception{
        System.out.println(new HammingDistanceSolution().hammingDistance(5 , 1));
    }

    public int hammingDistance(int x, int y) {
        int z = (x ^ y);
        int count = 0;
        for(int loopVariable = 0; loopVariable < 31; loopVariable++){
            if((z & (1 << loopVariable)) > 0){
                count++;
            }
        }
        return count;
    }
}