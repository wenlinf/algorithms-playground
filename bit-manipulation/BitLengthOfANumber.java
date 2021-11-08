class BitLengthOfANumber {
    public static int bitsLength(int number) {
        int count = 0;

        while ((1 << count) <= number) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bitsLength(8));
        System.out.println(bitsLength(2));
        System.out.println(bitsLength(7));
    }
}
