package Java8;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Employ> emp=new ArrayList<Employ>();
        emp.add(new Employ(1,"Hi     ",20000));
        emp.add(new Employ(2,"Hello  ",30000));
        emp.add(new Employ(3,"Iam    ",40000));
        emp.add(new Employ(4,"soandso",50000));

        System.out.println("Employee names are");
        Function<Employ, String> getName = e -> e.getName();
        emp.stream().map(getName).forEach(System.out::println);

        System.out.println("Employee salaries are");
        Function<Employ, Double> getSalary = e -> e.getSalary();
        emp.stream().map(getSalary).forEach(System.out::println);

        System.out.println("all employee details are ");
        Function<Employ, String> getAll= e -> "Employ "+e.getName() +
                "  Number "+e.getEmpno()+ "  Salary "+e.getSalary();
        emp.stream().map(getAll).forEach(System.out::println);

        System.out.println("all employee salaries after increment of 1.5 ");
        Function<Employ, Double> increment= e -> e.getSalary()*1.5;
        emp.stream().map(increment).forEach(System.out::println);

        System.out.println("all employee details after increment of 1.5 ");
        Function<Employ, String> getAll2= e -> "Employ "+e.getName() +
                "  Number "+e.getEmpno()+ "  Salary "+e.getSalary()*1.5;
        emp.stream().map(getAll2).forEach(System.out::println);


    }
}
