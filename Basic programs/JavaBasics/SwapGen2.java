package JavaBasics;

public class SwapGen2 {
    public static void main(String[] args) {
        SwapGen<Integer> s=new SwapGen();
        s.swap(2, 3);
        SwapGen<String> s1=new SwapGen();
        s1.swap("Hi", "Hello");
    }

}
