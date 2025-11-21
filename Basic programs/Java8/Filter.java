package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Employ> employs=new ArrayList<Employ>();
        employs.add(new Employ(1,"Hello",10000));
        employs.add(new Employ(2,"Hi",20000));
        employs.add(new Employ(3,"How",30000));
         Stream<Employ> stream=employs.stream().filter(x-> x.getName().startsWith("H"));
          stream.forEach(System.out::println);
    }
}
