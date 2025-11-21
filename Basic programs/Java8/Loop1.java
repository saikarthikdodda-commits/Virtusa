package Java8;

import java.util.ArrayList;
import java.util.List;

public class Loop1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Hi");
        names.add("Hello");
        names.add("Good morning");
        names.add("How are you");
        System.out.println("names are : ");
        names.forEach(System.out::println);
    }

}
