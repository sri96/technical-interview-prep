import java.util.*;

public class SubsetsIISolution {

    public static void main(String[] args) throws Exception {
        int[] n = {1, 2, 3};
        List<List<Integer>> result = new SubsetsIISolution().subsetsWithDup(n);
        System.out.println(result);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); //empty subset
        int start = 0, newStart = 0;
        Arrays.sort(nums);
        for (int i = 0, l = nums.length; i < l; i++) {
            newStart = result.size();
            if (i == 0 || nums[i] != nums[i - 1]) {
                start = 0;
            }
            for (int j = start, resLen = result.size(); j < resLen; j++) {
                List<Integer> newList = new ArrayList<>(result.get(j));
                newList.add(nums[i]);
                result.add(newList);
            }
            start = newStart;
        }
        return result;
    }

}