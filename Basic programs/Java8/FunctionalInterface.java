package Java8;
@java.lang.FunctionalInterface


interface Iexam {
    String exam(String name);
}

public class FunctionalInterface   {
    public static void main(String[] args) {
        Iexam i=(name)-> "Hi, Hello";
        System.out.println(i.exam("Hii"));
    }

}

