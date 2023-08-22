package talsk2;
import java.util.Arrays;

public class Task2 {
    @FunctionalInterface
    public interface StringComparer {
        boolean compare(String s1, String s2);
    }
}
