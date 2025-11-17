package JavaBasics;

public class SwapGen <t>{
    void swap(t a, t b) {
        t temp=a;
        a=b;
        b=temp;
        System.out.println("a is :"+a+" b is :"+b);
    }

}
