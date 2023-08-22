package talsk2;

import java.util.Arrays;
import java.util.Comparator;

public class StringUtils {

    public static void main(String[] args) {
        String str1 = "Donkey";
        String str2 = "Cat";
        Task2.StringComparer goCompare = (string1, string2) -> string1.length() > string2.length();
        System.out.println("The goCompare is: " + goCompare);
        String result = betterString(str1, str2, goCompare);
        System.out.println("The result is: " + result);
    }

    public static String betterString(String string1, String string2, Task2.StringComparer comparer) {
        if (comparer.compare(string1, string2)){
            return string1;
        }
        else {
            return string2;
        }
    }
}

