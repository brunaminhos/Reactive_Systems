package task3;

import javax.lang.model.element.Element;

public class Task3 {
    @FunctionalInterface
    public interface ElementComparer<E> {
        boolean compare(E e1, E e2);
    }
}

