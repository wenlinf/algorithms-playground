public class SelectionSort {
    static int[] selectionSort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int first = arr[i];
            int lowestIndex = i;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[j]<arr[lowestIndex]){
                    lowestIndex=j;
                }
                if (j==arr.length-1&&lowestIndex!=i){
                    int temp = arr[lowestIndex];
                    arr[lowestIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sorted = selectionSort(new int[]{1, 6, 4, 8, 3, 9, 7});
        for (int i = 0; i <sorted.length ; i++) {
            System.out.println(sorted[i]);
        }
    }
}
