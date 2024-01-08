import java.util.Random;

public class cat {
    public static void main(String[] args) {
        Random random = new Random();
        int step,len=0,i=0;
        while (len<50) {
            step=random.nextInt(3)+5;
            len+=step;
            i++;
            if (len>=50) len=50;
            System.out.printf("%d %d %d \n",i,step,len);

        }
    }
}
