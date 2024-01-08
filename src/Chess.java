public class Chess {
    public static void main(String[] args){
      int x1 = 3, y1 = 2;
      int x2 = 5, y2 = 4;
      if (x1==x2 ^ y1==y2)
          System.out.println(true);
      else System.out.println(false);
    }
}
