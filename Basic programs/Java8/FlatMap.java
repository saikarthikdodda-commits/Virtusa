package Java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<String> L1= Arrays.asList("A","B","C","D","E");
        List<String> L2= Arrays.asList("F","G","H","I","J");

        List<List<String>> L3= Arrays.asList(L1,L2);
        L3.forEach(System.out::println);

        List<String> flatEx = L3.stream().flatMap(x ->  x.stream()).collect(Collectors.toList());
        flatEx.forEach(System.out::println);

    }
}
