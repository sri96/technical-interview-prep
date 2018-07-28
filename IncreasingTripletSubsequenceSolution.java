import java.util.*;

public class IncreasingTripletSubsequenceSolution {

    public static void main(String[] args) throws Exception{
        int[] inputArray = {1, 2, 3, 4, 5};
        System.out.println(new IncreasingTripletSubsequenceSolution().increasingTriplet(inputArray));
    }

    public boolean increasingTriplet(int[] numbers) {
        int[] A = new int[3];
        Arrays.fill(A, Integer.MAX_VALUE);
        for (int number : numbers) {
            if (number < A[0]) {
                A[0] = number;
            } else if (number < A[1] && number > A[0]) {
                A[1] = number;
            } else if (number < A[2] && number > A[1]) {
                return true;
            }
        }
        return false;
    }
}