class InsertNumber {
    public static int insertNumber(int m, int n, int i, int j) {
        //create a mask to clear bits from j to 0
        int maskJthrough0 = -1 << (j + 1);

        // create another mask to clear bits from MSB to i
        int maskMSBthroughI = (1 << i) - 1;

        //get the new mask that has all 1s, except for the 0s between i and j
        int mask = maskJthrough0 | maskMSBthroughI;

        int n_cleared = n & mask;
        int m_shifted = m << i;
        return n_cleared | m_shifted;
    }

    public static void main(String[] args) {
        System.out.println(insertNumber( 19, 1024, 2, 6));;
    }
}
