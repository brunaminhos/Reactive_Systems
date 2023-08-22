package Practical3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practical3 {
    static List<String> list = List.of("The", "quick", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
    static Stream<String> myStream = Stream.of("The", "quick", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
    static Stream<Integer> myIn = Stream.of(1, 2, 3, 4, 5);

    static Long numStartingWithQ(List<String> list){
        return list.stream().filter(s -> s.startsWith("q")).count();
    }

    static Stream<String> wordsLongerThanThreeChars(Stream<String> stream){
        return stream.filter(s -> s.length() > 3);
    }

    static Stream<String> firstTwoWordsLongerThanThreeChars(Stream<String> stream){
        return stream.filter(s -> s.length() > 3).limit(2);
    }

    static Stream<String> firstTwoDistinctFiveCharWordsAlphabeticalOrder(Stream<String> stream){
        return stream.distinct().filter(s -> s.length() > 3).limit(2).sorted();
    }

    static List<Integer> lengthOfWordsList(Stream<String> stream){
        return stream.map(s -> s.length()).collect(Collectors.toList());
    }

    static Boolean containsQuickAfterThirdElement(List<String> list){
        return list.stream().skip(3).anyMatch(s -> s.equalsIgnoreCase("quick"));
    }

    static Map<Integer, Integer> doubledNumbersMap(Stream<Integer> stream){
        return stream.filter(s -> s > 2).collect(Collectors.toMap(s -> s, s -> s*2));
    }

    public static void main(String[] args) {
        System.out.println("numStartingWithQ: " + numStartingWithQ(list));
        wordsLongerThanThreeChars(list.stream()).forEach(s -> System.out.println("wordsLongerThanThreeChars: " + s));
        firstTwoWordsLongerThanThreeChars(myStream).forEach(s -> System.out.println("firstTwoWordsLongerThanThreeChars: " + s));
        firstTwoDistinctFiveCharWordsAlphabeticalOrder(list.stream()).forEach(s -> System.out.println("firstTwoDistinctFiveCharWordsAlphabeticalOrder: " + s));
        lengthOfWordsList(list.stream()).forEach(s -> System.out.println("lengthOfWordsList: " + s));
        System.out.println("containsQuickAfterThirdElement: " + containsQuickAfterThirdElement(list));
        for (var entry : doubledNumbersMap(myIn).entrySet()) {
            System.out.println("doubledNumbersMap Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
