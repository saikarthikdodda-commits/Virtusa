package JavaBasics;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int fact=1;
        for (int i = n; i >=1 ; i--) {
           fact=fact*i;
        }System.out.println(fact);
    }
}
