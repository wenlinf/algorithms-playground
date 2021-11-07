class HammingDistance {

    public static int hammingDistance(int a, int b) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((((a >> i) & 1) ^ ((b >> i) & 1)) == 1) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        System.out.println("Hamming Distance between two integers is " + hammingDistance(a, b));
    }
}
