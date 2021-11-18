public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int min;
        int minIndex;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = arr[i];
                arr[i] = min;
                arr[minIndex] = temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] ints = selectionSort(new int[]{3, 2, 6, 5, 7, 6, 9, 2, 4, 1});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
