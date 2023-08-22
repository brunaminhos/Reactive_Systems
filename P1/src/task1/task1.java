package task1;

import java.util.Arrays;
import java.util.Comparator;

public class task1 {
    public static void main(String[] args) {
        String[] strArray = {"String1", "SecondString", "AnotherOne", "ThisIsTheLast"};
        Comparator<String> A = (str1, str2) -> str2.length() - str1.length();
        Arrays.sort(strArray, A);
        System.out.println(Arrays.asList(strArray));

        Comparator<String> B = (str1, str2) -> str1.charAt(0) - str2.charAt(0);
        Arrays.sort(strArray, B);
        System.out.println(Arrays.asList(strArray));

        Comparator<String> C = (str1, str2) ->{ if (str1.contains("e") && str2.contains("e")) {
            return 0;
        } else if (str1.contains("e")) {
            return -1;
        }else{
            return 1;
        }
    };
        Arrays.sort(strArray, C);
        System.out.println(Arrays.asList(strArray));
    }
}
