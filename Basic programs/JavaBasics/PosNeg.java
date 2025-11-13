package JavaBasics;

import java.util.Scanner;

public class PosNeg {
    public void num(int i) {

        if(i>=0) {
            System.out.println("positive");
        }else {
            System.out.println("Negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter i value");
        int i=sc.nextInt();
        PosNeg pn=new PosNeg();
        pn.num(i);
    }
}
