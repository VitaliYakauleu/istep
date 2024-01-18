package games;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //комп загадывает число от 1 до 100
        Random random =new Random();
        int num = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);

        int guessed = 0;
        while (guessed!=num) {
            System.out.println("Введи число ");

            guessed = scanner.nextInt();
            if (guessed > num)
                System.out.println("less");
            else System.out.println("Угадал");
        }
    }
}
