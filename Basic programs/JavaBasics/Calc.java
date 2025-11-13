package JavaBasics;

import java.util.Scanner;

public class Calc {
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a ,int b) {
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calc c=new Calc();
        System.out.println("enter a,b values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //c.add(a,b);
        //c.sub(a,b);
        System.out.println(c.add(a, b));
        System.out.println(c.sub(a, b));
    }
}
