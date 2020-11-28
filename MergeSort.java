public class MergeSort {
    static int[] merge(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        while (i<arr1.length&&j<arr2.length){
            if (arr1[i]<=arr2[j]){
                newArr[i+j]=arr1[i];
                i++;
            } else{
                newArr[i+j]=arr2[j];
                j++;
            }
        }
        if (i==arr1.length&&j!=arr2.length){
            for (int k = j; k <arr2.length; k++) {
                newArr[i+k] = arr2[k];
            }
        }
        if (i!=arr1.length&&j==arr2.length){
            for (int k = i; k <arr1.length; k++) {
                newArr[j+k] = arr1[k];
            }
        }
        return newArr;
    }
    static int[] mergeSort(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int mid = arr.length/2;
        int[] leftArr=new int[mid-left];
        int[] rightArr= new int[right-mid+1];
        for (int i = 0; i <mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i <arr.length; i++) {
            rightArr[i-mid] = arr[i];
        }
        if (leftArr.length<=1&&rightArr.length<=1) return merge(leftArr,rightArr);
        else{
            leftArr = mergeSort(leftArr);
            rightArr = mergeSort(rightArr);
            arr = merge(leftArr,rightArr);
            return arr;
        }
    }

    public static void main(String[] args) {
//        int[] merge = merge(new int[]{1, 5, 9}, new int[]{2, 3});
//        //int[] merge = merge(new int[]{1, 2,3, 5, 9}, new int[]{2, 3,9,9,9,10});
//        for (int i = 0; i <merge.length ; i++) {
//            System.out.println(merge[i]);
//        }
        int[] mergeSort = mergeSort(new int[]{3, 2, 6, 5, 7, 6, 9, 2, 4, 1});
        for (int i = 0; i <mergeSort.length ; i++) {
            System.out.println(mergeSort[i]);
        }
    }
}
