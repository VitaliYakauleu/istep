package Calculation;

public class Task1_22 {
    public static void main(String[] args) {
        double x = 1.;
        double y = 7*x*x-3*x+6;
        System.out.println(y);

        double h=1, r=6350_000;
        double l=Math.sqrt((r+h)*(r+h)-r*r);
        System.out.println(l);
    }
}
