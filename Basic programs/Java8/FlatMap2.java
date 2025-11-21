package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class FlatMap2 {
    public static void main(String[] args) {
        List<Employ> emp=new ArrayList<Employ>();
        emp.add(new Employ(1,"Hi     ",20000));
        emp.add(new Employ(2,"Hello  ",30000));
        emp.add(new Employ(3,"Iam    ",40000));
        emp.add(new Employ(4,"soandso",50000));


        System.out.println("Employee names are");
        emp.stream().flatMap(e-> Stream.of(e.getName())).
                collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Employee details  are");
        emp.stream().flatMap(e->Stream.of(e.getEmpno(),e.getName(),e.getSalary())).
                collect(Collectors.toList()).forEach(System.out::println);

    }


}
