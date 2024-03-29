public class BinarySearch {
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = Math.round((start+end)/2);
            if (target>arr[mid]){
                start=mid+1;
            }
            if (target<arr[mid]){
                end = mid-1;
            }
            if (target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = BinarySearch(new int[] {1,2,3,4,5},0);
        System.out.println(res);
    }
}
