package JavaBasics;

import java.util.Scanner;

public class Circle {
    public void area(int radius) {
        double area=3.14*radius*radius;
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        System.out.println("enter radius");
        int radius=sc.nextInt();
        c.area(radius);

    }
}
