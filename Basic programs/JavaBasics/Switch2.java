package JavaBasics;

import java.util.Scanner;

public class Switch2 {
    public void month(int month) {
        Scanner sc=new Scanner(System.in);
        switch(month) {
            case 1,3,5,7,8,10,12:System.out.println("Month has 31 days");
                break;
            case 4,6,9,11:System.out.println("month has 30 days");
                break;
            case 2:System.out.println("enter year");
                int year = sc.nextInt();
                if(year%4==0 ) {
                    System.out.println("this month has 29 days");
                }else {
                    System.out.println("in "+year+" feb month has 28 days");
                }
                break;
            default:System.out.println("invalid month");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Switch2 s =new Switch2();
        System.out.println("enter month ");
        int month=sc.nextInt();
        s.month(month);

    }
}
