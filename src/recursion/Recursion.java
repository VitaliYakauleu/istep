package recursion;

public class Recursion {
    static int index =0;
    public static void main(String[] args) {
       // recurs(0); //enter in rec
        System.out.println(sum(5));
    }
    static void recurs(int i){
        System.out.println("привет");
        if (index==5) return;// выход из рекурсии
        index++;// полезная работа
        recurs();// рекурсионный вызов
    }
    static void recurs(){
        System.out.println("привет");
        if (index==5) return;// выход из рекурсии

        recurs(+1);// рекурсионный вызов
    }
    static int sum(int number){
        if(number==0)return 0;
        return number+sum(number-1);
    }
}
