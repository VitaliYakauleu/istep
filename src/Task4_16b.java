import java.util.Scanner;

public class Task4_16b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите площадь круга: ");
        double areaCircle = scanner.nextDouble();

        System.out.print("Введите площадь квадрата: ");
        double areaSquare = scanner.nextDouble();

        if (areaSquare <= areaCircle) {
            System.out.println("Квадрат уместится внутри круга");
        } else {
            System.out.println("Квадрат не уместится внутри круга");
        }
    }
}
