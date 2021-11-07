class OddOccurringElement {
  // Time complexity O(n)
  // Space complexity O(1)
    private static int helper(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int result = helper(new int[]{4, 3, 3, 4, 4, 4, 5, 3, 5});
        System.out.println("Odd occurring element is " + result);
    }
}
