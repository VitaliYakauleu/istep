package Arrays2d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays2D {
    static int[][] arr;
    static int rows = 6;
    static int cols = 5;
    public static void main(String[] args) {
        arr = new int[rows][cols];
        for (int i=0; i<rows; i++)
            for (int j=0; j<cols; j++)
                arr[i][j] = j+1;
        print();

//System.out.println

    }

    static void print(){
        for (int i=0; i<rows; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
    static void fillOrder(){
        for (int i=0; i<rows; i++)
            for (int j=0; j<cols; j++)
                arr[i][j] = j+1+i*cols;
    }
}
