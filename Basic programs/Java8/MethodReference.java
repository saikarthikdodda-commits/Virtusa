package Java8;

import java.util.Scanner;
interface Icalc{
    int calc(int a,int b);
}
public class MethodReference {
    public static void main(String[] args) {
        Calculation c=new Calculation();

        Icalc ob1=c::sum;
        System.out.println("Addition : "+ ob1.calc(10,5));
        Icalc ob2=c::sub;
        System.out.println("substraction : "+ob2.calc(10,5));
        Icalc ob3=c::mult;
        System.out.println("Multiplication : "+ ob3.calc(10,5));
        Icalc ob4=c::div;
        System.out.println( "Division : "+ob4.calc(10,5));

    }
}
