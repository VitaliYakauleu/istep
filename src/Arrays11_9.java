public class Arrays11_9 {
    private static final int SIZE = 5;
    static int[] arr = new int[SIZE];

    public static void main(String[] args) {
        fillOrder();
        print();
    }


    static void fillOrder() {
        for (int i = 0; i < SIZE; i++)
            arr[i] = i + 1;
    }

    static void print() {
        for (int i = 0; i < SIZE; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}