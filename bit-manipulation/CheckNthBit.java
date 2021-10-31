
public class CheckNthBit {
    public static boolean checkNthBit(int num, int index) {
        return (num & 1 << index) != 0;
    }



    public static void main(String[] args) {
        System.out.println(checkNthBit(5, 1));
    }

}
