package task3;

import talsk2.Task2;

public class ElementUnits<E> {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        Task3.ElementComparer compareInt = (element1, element2) -> ((Number)element1).intValue() < ((Number)element2).intValue();
        System.out.println("The compareInt is: " + compareInt);
        Integer resultInt = betterElement(num1, num2, compareInt);
        System.out.println("The result is: " + resultInt);
        String string1 = "donkey";
        String string2 = "cat";
        Task3.ElementComparer compareString = (element1, element2) -> element1.toString().length() > element2.toString().length();
        System.out.println("The compareString is: " + compareString);
        String resultString = betterElement(string1, string2, compareString);
        System.out.println("The result is: " + resultString);

    }

    public static <E> E betterElement(E element1, E element2,Task3.ElementComparer comparer) {
        if (comparer.compare(element1, element2)){
            return element1;
        }
        else {
            return element2;
        }
    }
}


