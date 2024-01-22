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

//Заменить первую букву на прописную
            s = "what is JIT compiler in Java?";
            sb = new StringBuilder(s);
            s2 = s.substring(0,1);
            s2= s2.toUpperCase();
            Character c0 = s2.charAt(0);
            sb.setCharAt(0,c0);
            System.out.println(sb);

            //Разбить строку на подстроки
            s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
            System.out.println(s);

            //Удалить концевые пробелы
            s = " Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                    + "innheritance, encapsulation, polymorphism, abstraction. ";
            String result = s.trim();
            System.out.println(result);
        }

    }
}
final class Book{

}

