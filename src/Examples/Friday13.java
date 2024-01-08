package Examples;

public class Friday13 {
    public static void main(String[] args) {
        int year = 2024;
        int dayOfWeek = 5; //Первая пятница приходится на 5-е января
        int day = 13;
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i = 5; i <=366 ; i+=7) {
            int month = 0;
            int dayCurr = i;
            while (dayCurr>0)
                dayCurr-=days[month++];
            dayCurr+=days[month-1];
            if (dayCurr==day)
                System.out.println(month);

        }
    }
}
