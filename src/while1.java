
////Кузнечик прыгает на 1 см, затем на 2, на 3 и т.д.
// Через сколько прыжков он взберется на травинку высотой 50 см?
public class while1 {
    public static void main(String[] args) {
        int h = 0;
        int hope = 1;
        for (int i=0; i<20; i++){
            h+=hope;
            hope++;
            if (h>50) h = 50;
            System.out.println(i+" "+h);
            if (h==50) {
                break;

            }

        }

    }
}
