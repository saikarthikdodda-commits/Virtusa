package Java8;

import java.util.ArrayList;
import java.util.List;

public class New2 {
    public static void main(String[] args) {
         List<Employ> emp=new ArrayList<Employ>();
         emp.add(new Employ(1,"Bye",20000));
         emp.add(new Employ(2,"Cat",30000));
         emp.add(new Employ(3,"Apple",40000));
         emp.add(new Employ(4,"Dog",50000));
         emp.add(new Employ(5,"Elephant",60000));

         emp.forEach(System.out::println);
         System.out.println("Sort By Name Wise  ");

         emp.stream().sorted( (e1, e2) -> {
            return e1.getName().compareTo(e2.getName());
          }).forEach(System.out::println);

    }
}
