package Array;

public class Sample6 {
    public static void main(String[] args) {
        //опеределить количество простых делителей числа
        int num = 12;

        int count =0;
        double s= Math.sqrt(num);
        for (int i=2; i<=s;i++)
            if (num%i==0 && prime(i)) count++;

        System.out.println(count);
    }
    static boolean prime (int num){
        if (num<2)
            return false;
        double s= Math.sqrt(num);
        for (int i=2; i<=s;i++)
            if (num%i==0)
                return false;
        return true;
    }
    static void getCount(int num){
        int count =0;
        double s= Math.sqrt(num);
        for (int i=2; i<=s;i++)
            if (num%i==0 && prime(i)) count++;
    }
}
