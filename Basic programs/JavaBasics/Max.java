package JavaBasics;

import java.util.Scanner;

public class Max {
    public void max(int a , int b, int c) {
        int max=a;
        if(b>max) {
            max=b;
        }if(c>b) {
            max=c;
        }
        System.out.println("max is"+max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,c values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Max m=new Max();
        m.max(a, b, c);


    }
}
