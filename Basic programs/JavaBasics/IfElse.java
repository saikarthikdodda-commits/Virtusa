package JavaBasics;

import java.util.Scanner;

public class IfElse {
    public void PosNeg(int n){
        if(n<=0){
            System.out.println("n is negative");
        }else{
            System.out.println("n is positive");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        IfElse ie = new IfElse();
        ie.PosNeg(n);
    }
}
