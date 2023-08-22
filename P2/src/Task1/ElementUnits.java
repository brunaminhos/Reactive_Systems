package Task1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ElementUnits<E> {

    public static void main(String[] args) {
        String string1 = "donkey";
        String string2 = "cat";

        BiFunction<String, String, Boolean> compareString = (element1, element2) -> element1.length() > element2.length();
        BiFunction<String, String,String> betterElement = (element1, element2) -> element1;

        System.out.println(string1+"The compareString is: " + string2+ ":" +compareString.apply(string1,string2));
        //String resultString = betterElement(string1, string2, compareString.apply());
        System.out.println("The result is: " +string1+ " or " +string2+ " : "+ betterElement.apply(string1,string2));

    }

    public static <E> E betterElement(E element1, E element2,Task1.ElementComparer comparer) {
        if (comparer.compare(element1, element2)){
            return element1;
        }
        else {
            return element2;
        }
    }
}