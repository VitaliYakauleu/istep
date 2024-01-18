package ArraysSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dummy {
    static int[] arr = {3, 1, 2, 6, 7, 5, 2};
    static int size =arr.length;

    public static void main(String[] args) {
        dummySort();
        System.out.println(Arrays.toString(arr));
    }

    public static void dummySort() {
        int i=0;
        while (i<size-1)
            if (arr[i] > arr[i + 1]) {
                swap( i, i + 1);
                i=0;
            }
            else i++;
    }

    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}