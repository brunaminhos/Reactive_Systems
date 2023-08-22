package task2;



import java.util.function.Function;

public class task2 {
    public static void main(String[] args) {

//Create a lambda of type Function<T,R> that multiplies an int by 3 – call it triple
        Function<Integer, Integer> triple = num -> num * 3;
        System.out.println(" 2 multiply by 3 is: " + triple.apply(2));

//Create a lambda of type Function<T,R> that multiplies an int by 4 – call it quadruple
        Function<Integer, Integer> quadruple = num -> num * 4;
        System.out.println(" 2 multiply by 4 is: " + quadruple.apply(2));

//Combine these lambdas triple and quadruple into one that multiplies an int by 12.
        System.out.println("Combine Lambdas result is: " + triple.andThen(quadruple).apply(2));
    }
}
