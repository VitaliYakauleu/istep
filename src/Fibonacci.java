public class Fibonacci {
    //Как работает формула Фибоначчи?
    //Последовательность чисел Фибоначчи определяется
    // формулой Fn = Fn-1 + Fn-2 . То есть,
    // следующее число получается как сумма двух предыдущих.
    // Первые два числа равны 1 ,
    // затем 2(1+1) , затем 3(1+2) , 5(2+3) и так далее:
    // 1, 1, 2, 3, 5, 8, 13, 21... .
    public static void main(String[] args) {
        int first=0; int second = 1;
        int third;
        for (int i=0; i<10; i++) {
            third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }

    }
}
