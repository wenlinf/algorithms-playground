public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        if (num == 0) return false;
        while (num % 2 == 0) num /= 2;
        return num == 1;
    }
  
   public static boolean isPowerOfTwoBitManipulation(int num) {
        return (num != 0) && ((num & (num - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(10));
        System.out.println(isPowerOfTwo(16));
    }

}
