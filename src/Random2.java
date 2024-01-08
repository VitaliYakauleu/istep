import java.util.Random;
import java.util.Scanner;

public class Random2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random(); //Java Random class vs Math.random()
        for (int i=0; i<9; i++)
            System.out.print((random.nextInt(18)+3)+" "); //[0; 9)


        for (int i=0; i<9; i++){
            System.out.print("1th:"+(i+1));
            System.out.println("2th:"+(9-i));
        }
        for (int i=0; i<9; i++){

        }
        //Два шага вперед, один назад: 0,2,1,3,2,4,3,5
        for (int i=0; i<9; i++){
            System.out.println("1th:"+(i+1)+(i-2));

        }

    }
}
