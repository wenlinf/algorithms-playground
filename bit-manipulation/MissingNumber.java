import java.util.Set;
import java.util.HashSet;

class MissingNumber {
    public static int missingNumber(int[] nums){
       int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= (i ^ nums[i]);
        }
        res ^= nums.length;
        return res;
    }
    private static int helper(int[] nums) {
        int sum = (0 + nums.length) * (nums.length + 1) / 2;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return sum - total;
    }
    
    private static int helperWithSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing element in the array is " + helper(nums));
    }
}
