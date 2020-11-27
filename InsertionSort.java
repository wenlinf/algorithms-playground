public class InsertionSort {
    static int[] insertionSort(int[] arr){
        for (int i = 1; i <arr.length; i++) {
            for (int j = i; j>0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sorted = insertionSort(new int[]{3, 1, 6, 4, 8, 3, 9, 7});
        for (int i = 0; i <sorted.length ; i++) {
            System.out.println(sorted[i]);
        }
    }
}
