package Arays;

public class Task4_11 {
    public static void main(String[] args) {
        int[] arr={2,7,3,11,3,7,2};

        System.out.println(isPrime(15));
    }

    static boolean isPrime(int n){
       // boolean flag = true; //Предполагаем, что число n - простое
        for (int i=2; i<=Math.sqrt(n); i++)
            if (n%i==0) return false;
        return false;
    }

   // static boolean allIsPrime(int [] arr){}
}
