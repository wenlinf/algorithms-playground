public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sorted = bubbleSort(new int[]{1, 6, 4, 8, 3, 9, 7});
        for (int i = 0; i <sorted.length ; i++) {
            System.out.println(sorted[i]);
        }
    }
}
