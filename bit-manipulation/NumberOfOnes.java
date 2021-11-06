
public class NumberOfOnes {
    public static int numOfOnes(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 1) count++;
            num = num / 2;
        }
        return count;
    }

    public static int numOfOnesBitManipulation(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
    
    public static int numOfOnesLookupTable(int num) {
        int[] table = new int[256];

        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i >> 1];
        }

        int res = 0;
        for (int i = 0; i < 4; i++) {
            res += table[n & 0xff];
            n >>= 8;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(numOfOnesBitManipulation(6));
        System.out.println(numOfOnesBitManipulation(8));
        System.out.println(numOfOnesBitManipulation(10));
        System.out.println(numOfOnesBitManipulation(16));
        System.out.println(numOfOnesBitManipulation(0));
    }

}
