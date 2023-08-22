package Task4;

import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {

        //create a lambda that checks whether an integer is greater than 10
        Predicate<Integer> isGreaterThan = num -> num > 10;
        System.out.println("Is 4 Greater than 10?: " + isGreaterThan.test(4));

        //Create a lambda that checks if an integer is even
        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        System.out.println("Is 4 Even: " + isEven.test(4));
        // - Create a lambda that checks if an integer is greater than 10 and is even (you should make use
//of the previous two lambdas for this)
        System.out.println("Is 12 Greater than 10 and even?: " + isGreaterThan.and(isEven).test(12));

    }
}


