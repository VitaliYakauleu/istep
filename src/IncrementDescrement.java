public class IncrementDescrement {
    public  static void main(String[] args){
        int x, y;
        System.out.println("1th");
        x=1; y=++x;
        System.out.println(x+" "+y);
        x=1; y=x++;
        System.out.println(x+" "+y);
        x=1; y=--x;
        System.out.println(x+" "+y);

        System.out.println("1th");
        x=0; y=0; y=++x+x++;
        System.out.println(x+" "+y);
        x=0; y=0; y+=++x+x++;
        System.out.println(x+" "+y);
    }
}
