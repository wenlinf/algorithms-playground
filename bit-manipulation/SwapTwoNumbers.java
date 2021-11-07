class SwapTwoNumbers {
    private static int[] solution(int a, int b) {
      // better solution
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        return new int[]{a, b};
    }
  
   private static int[] helper(int a, int b) {
     // my solution
        for (int i = 0; i < 32; i++) {
            if (((a >> i & 1) ^ (b >> i & 1)) == 1) {
                a = a ^ (1 << i);
                b = b ^ (1 << i);
            }
        }
        return new int[]{a, b};
    }
  
    public static void main(String[] args) {
        int a = 12;
        int b = 36;
        final int[] helper = helper(a, b);
        for (int num: helper) {
            System.out.println(num);

        }
    }
}
