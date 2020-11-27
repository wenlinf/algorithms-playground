public class LinearSearch {
    public static void main(String[] args) {
        int res = linearSearch(new int[]{1,2,3,4,5},8);
        System.out.println(res);
    }

    static int linearSearch(int[] arr, int target){
        int result =-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==target){
                result=i;
                break;
            }
        }
        return result;
    }
}
