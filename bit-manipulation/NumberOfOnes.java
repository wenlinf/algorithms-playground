
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

    public static void main(String[] args) {
        System.out.println(numOfOnesBitManipulation(6));
        System.out.println(numOfOnesBitManipulation(8));
        System.out.println(numOfOnesBitManipulation(10));
        System.out.println(numOfOnesBitManipulation(16));
        System.out.println(numOfOnesBitManipulation(0));
    }

}
