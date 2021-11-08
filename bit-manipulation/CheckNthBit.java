
public class CheckNthBit {
    public static boolean checkNthBit(int num, int index) {
        // using left shift
        return (num & 1 << index) != 0;
    }

    public static boolean checkKthBitSet(int n, int k) {
        // using right shift
        return ((n >> (k - 1)) & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println(checkNthBit(5, 1));
        
        System.out.println("n = 5, k = 3 : " + checkKthBitSet(5, 3));
        System.out.println("------------");
        System.out.println("n = 10, k = 2 : " + checkKthBitSet(10, 2));
        System.out.println("------------");
        System.out.println("n = 10, k = 1 : " + checkKthBitSet(10, 1));
    }

}
