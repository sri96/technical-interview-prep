public class SearchInsertPositionSolution {
    public static void main(String[] args) throws Exception {
        int[] inputNumbers = {1, 3, 5, 6};
        System.out.println(new SearchInsertPositionSolution().searchInsert(inputNumbers, 6));
    }

    public int searchInsert(int[] inputNumbers, int target) {
        int position = inputNumbers.length;
        int start = 0, end = inputNumbers.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (inputNumbers[middle] >= target) {
                position = middle;
                end = middle - 1;
            } else start = middle + 1;
        }
        return position;
    }

}