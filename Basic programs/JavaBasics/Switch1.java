package JavaBasics;

import java.util.Scanner;

public class Switch1 {
    public void change(int choice) {
        switch(choice){
            case 1: System.out.println("it is monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default: System.out.println("Enter valid Choice");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Choice");
        int choice =sc.nextInt();
        Switch1 s=new Switch1();
        s.change(choice);

    }
}
