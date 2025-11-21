package Java8;

interface Greeting {
    void greet();
}
public class LambdaExpression {
    public static void main(String[] args) {
        Greeting g=()->{
            System.out.println("Hello Good morning");
        };
        g.greet();
    }
}
