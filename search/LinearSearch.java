public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = linearSearch(new int[]{1,2,3,4,5},3);
        System.out.println(res);
    }
}
