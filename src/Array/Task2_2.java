package Array;

public class Task2_2 {
    public static void main(String[] args) {
        double sum =0;
        double x = 0.5;

        double y1 = x*(x+2)/2;
        double y2 = Math.pow(x,3)*(4+x)/24;
        double eps = 1e-6;
        double y = -1/x;
        int i = 1;
        while (Math.abs(y)>eps){
            double a =(2*i+x);
            y*= -x*x/(i*2+x)/i/(i+i);
            System.out.println(y);
            i+=2;
        }
    }
}
