package Task5;
import java.util.Objects;

public class Person {
    String name ;
    int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}