import java.util.Scanner;

public class helloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.nextLine();
        System.out.println("Hello"+name);

    }
}
