package Task3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        Function<Integer,Integer> same = x -> x;
        Function<Integer, Function<Integer,Integer>> makeAdder = x -> y -> x + y;
        System.out.println(" The answer is: " + num1 + num2 + makeAdder.apply(num2).apply(num1));

        BiFunction<Integer, Integer, Integer>  add = (x, y) -> x + y;
        System.out.println(" 2 plus 3 is: " + add.apply(num1, num2));




    }


}




