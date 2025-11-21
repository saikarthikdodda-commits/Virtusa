package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class New1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Hello","Good morning","How are you","Hello");

        list.stream().distinct().forEach(System.out::println);

    }

}
