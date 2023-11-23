public class Logical {
    public static void main(String[] args) {
        //Logical OR
      boolean a = false;
      boolean b = false;
      System.out.println(a||b);
      a = true;
      b = false;
      System.out.println(a||b);
      a = true;
      b = true;
      System.out.println(a||b);

      //Logical AND
        a = true;
        b = false;
        System.out.println(a&&b);
        a = true;
        b = true;
        System.out.println(a&&b);
        a = false;
        b = false;
        System.out.println(a&&b);
        //Logical NOT
        a = true;
        b = false;
        System.out.println(a&&b);
        a = true;
        b = true;
        System.out.println(a&&b);
        a = false;
        b = false;
        System.out.println(a&&b);
    }
}
