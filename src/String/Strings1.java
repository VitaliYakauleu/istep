package String;

public class Strings1 {
    public static void main(String[] args) {
        String s;
        s = "string 1";
        System.out.println(s.hashCode());
        s = "string 2";
        System.out.println(s.hashCode());
        //Object o;
        char c = s.charAt(s.length() - 1);
        System.out.println(c);

        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        String a = "" + c1 + c2+c3+c4+c5+c6+c7+c8;
        System.out.println(a);
        String s1 = "first";
        String s2 = "second";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));

        //Проверить, содержит ли строковое значение только цифры
        String s3 = "1234e234";
        boolean res = true;
        for (int i = 0; i < s3.length(); i++) {
            if (!Character.isDigit(s3.charAt(i)))
                res = false;
            System.out.println(res);

            //Проверить, содержит ли строка данную последовательность символов
            s = "good";
            s2 = "oo";
            System.out.println(s.contains(s2));

            //Проверить, одинаковы ли строки
            s = "good";
            s2 = "good";
            s2 = new String("good");
            boolean answer = s == s2 ? true : false;
            answer = s.equals(s2) ? true : false;
            System.out.println("Строки одинаковы: " + answer);

            //Заменить символ в строке (точку на вопросительный знак
                    s = "Why is garbage collection necessary in Java.";
            i = s.indexOf('.');
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(i,'?');
            System.out.println(sb);



        }

    }
}
final class Book{

}

