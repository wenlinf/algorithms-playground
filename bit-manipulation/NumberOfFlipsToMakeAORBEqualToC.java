class NumberOfFlipsToMakeAORBEqualToC {
    private static int helper(int a, int b, int c) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bitA = (a>>i) & 1;
            int bitB = (b>>i) & 1;
            int bitC = (c>>i) & 1;
            if ((bitA | bitB) != bitC) {
                if (bitC == 0) {
                    if ((bitA & bitB) != 0) {
                        res += 2;
                    } else {
                        res += 1;
                    }
                } else {
                    res += 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;
        System.out.println("Min Flips required to make two numbers equal to third is : " + helper(a, b, c));
    }
}

