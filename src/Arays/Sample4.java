package Arays;

//Удалить повторяющиеся элементы из массива.
public class Sample4 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,3,0,0};
        int lenght = 1;
        for (int i=0; i<arr.length; i++){
            boolean isUniqe = true;
            for (int j = 0; j < i; j++)
                if (arr[i]==arr[j]) isUniqe=false;
            if(isUniqe) lenght++;



        }
        //Определить длину результирующего массива
        int[] res;

    }
}