import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practical4 {

    static List<Integer> myIn = List.of(1,2,3,4,5,6,7,8,9,10);
    static List<String> theList = List.of("The", "quick", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
    static Integer[] evenNumberArray(List<Integer> list){
        return list.stream().filter(s -> s % 2 ==0).toArray(Integer[]::new);
    }
    static String firstWordEndingWithE(List<String> list) {
        return list.stream().filter(s -> s.endsWith("e")).findFirst().orElse("No words ending with e found");
    }

    static String parallelFirstWordEndingWithE(List<String> list){
        return list.stream().parallel().filter(s -> s.endsWith("e")).findFirst().orElse("No words ending with e found");
    }

    static Integer lengthOfLongestOWord(List<String> list){
        return list.stream().filter(s -> s.contains("o")).findAny().get().length();
    }

    static List<String> uppercaseLowercaseList(List<String> list){
        return list.stream().parallel().map(s -> s.toUpperCase() + ", " + s.toLowerCase()).collect(Collectors.toList());
    }

    static Integer sumOfSquaredNumbers(List<Integer> list){
        return list.stream().map(s -> s*s).reduce(0, Integer::sum);
    }

    static String stringOfFirstCharacters(List<String> list){
        return list.stream().map(s -> s.substring(0, 1)).reduce("", (carry, string)-> carry.concat(" ").concat(string));
    }

    public static void main(String[] args) {
        System.out.println("An Array containing even numbers: " + Arrays.toString(evenNumberArray(myIn)));
        System.out.println("firstWordEndingWithE is: " + firstWordEndingWithE(theList));
        System.out.println("parallelFirstWordEndingWithE is: " + parallelFirstWordEndingWithE(theList));
        System.out.println("lengthOfLongestOWord is: " + lengthOfLongestOWord(theList));
        System.out.println("uppercaseLowercaseList is: " + uppercaseLowercaseList(theList));
        System.out.println("sumOfSquaredNumbers is: " + sumOfSquaredNumbers(myIn));
        System.out.println("stringOfFirstCharacters is: " + stringOfFirstCharacters(theList));
    }
}