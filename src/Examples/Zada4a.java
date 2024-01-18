package Examples;
//1. Вывести все двухзначные числа, которые делятся на 3,
// но не делятся на 5,
public class Zada4a {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
