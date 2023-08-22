package Task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("Cali",2),
                new Person("Maya", 1),
                new Person("Piti", 5)
        };
        Comparator<Person> compareAge = (person1, person2) -> person1.getAge() - person2.getAge();
        Arrays.sort(people,compareAge);
        System.out.println(people[0].getAge());
        System.out.println(people[1].getAge());
        System.out.println(people[2].getAge());

        Comparator<Person> compareAlphabetically = (person1, person2) -> person1.getName().charAt(0) - person2.getName().charAt(0);
        Arrays.sort(people,compareAlphabetically);
        System.out.println(people[0].getName());
        System.out.println(people[1].getName());
        System.out.println(people[2].getName());
    }
}
