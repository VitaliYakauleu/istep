package Examples;

public class Serie2 {
    public static void main(String[] args) {
        double x =Math.PI/2;


        double sum = x;
        double a = x;
        double eps = 1e-5;
        int i = 0;
        while (a<eps){
            a*=x*x/(i+2)/(i+3);
          ///  a/=(i++ +1);
            sum+=a;
            i+=2;
        }
        System.out.println(sum);
        System.out.println(Math.exp(1));



    }
}
