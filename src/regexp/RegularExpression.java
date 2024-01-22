package regexp;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("..");
        Matcher matcher = pattern.matcher("as");
        boolean b = matcher.matches();
        System.out.println(b);
        //2
        boolean b2 = Pattern.compile("rd").matcher("aa").matches();
        System.out.println(b2);

        //3
boolean b3 =Pattern.matches("fd","..");
        System.out.println(b3);
    }

    static void chek(String regexp, String sTrue, String sFalse){
        chek("a", "b", "c");
//Строка начинается на букву "a"
    }
    //Строка содержит только один символ

    //Строка содержит одну или более букву "a", а за ней одну букву "b"

    //Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"

    //Слово состоит из двух букв, первая из которых "a"

    //Строка начинается на букву "a"
}
