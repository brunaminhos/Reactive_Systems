package Task1;

public class Task1 {
    @FunctionalInterface
    public interface ElementComparer<E> {
        boolean compare(E e1, E e2);
    }
}
