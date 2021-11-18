public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        int start = 0;
        int end = arr.length - 1;
        int middle = start + (end - start) / 2;
        int[] firstHalf = new int[middle - start + 1];
        int[] secondHalf = new int[end - middle];
        for (int i = 0; i < arr.length; i++) {
            if (i <= middle) {
                firstHalf[i] = arr[i];
            } else {
                secondHalf[i - middle - 1] = arr[i];
            }
        }
        if (firstHalf.length <= 1 && secondHalf.length <= 1) {
            return merge(firstHalf, secondHalf);
        } else {
            firstHalf = mergeSort(firstHalf);
            secondHalf = mergeSort(secondHalf);
            arr = merge(firstHalf, secondHalf);
        }
        return arr;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        if (arr1.length == 0) {
            return arr2;
        }
        if (arr2.length == 0) {
            return arr1;
        }
        int pointer1 = 0;
        int pointer2 = 0;
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        while (pointer1 != arr1.length && pointer2 != arr2.length) {
            if (arr1[pointer1] <= arr2[pointer2]) {
                result[index] = arr1[pointer1];
                pointer1++;
            } else {
                result[index] = arr2[pointer2];
                pointer2++;
            }
            index++;
        }
        while (pointer1 != arr1.length) {
            result[index++] = arr1[pointer1++];
        }
        while (pointer2 != arr2.length) {
            result[index++] = arr2[pointer2++];
        }
        return result;
    }

    public static void main(String[] args) {
        final int[] ints = mergeSort(new int[]{2, 4, 1, 3, 5});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}

