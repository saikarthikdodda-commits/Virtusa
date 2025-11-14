package com;
import java .util.Scanner;
/* Decimal to roman
 * M    1000
 * CM   900
 * D	500
 * CD	400
 * C	100
 * XC	90
 * L	50
 * XL 	40
 * X	10
 * XI	9
 * V	5
 * IV	4
 * I	1
 */
public class RomanNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();//1200=1000+100+100
        while(num>0) {
            if(num>=1000) {
                System.out.print("M");
                num=num-1000;//1200-1000=200
            }else if(num>=900) {
                System.out.print("CM");
                num=num-900;
            }else if(num>=500) {
                System.out.print("D");
                num=num-500;
            }else if(num>=400) {
                System.out.print("CD");
                num=num-400;
            }else if(num>=100) {
                System.out.print("C");
                num=num-100;
            }else if(num>=90) {
                System.out.print("XC");
                num=num-90;
            }else if(num>=50) {
                System.out.print("L");
                num=num-50;
            }else if(num>=40) {
                System.out.print("XL");
                num=num-40;
            }else if(num>=10) {
                System.out.print("X");
                num=num-10;
            }else if(num>=9) {
                System.out.print("IX");
                num=num-9;
            }else if(num>=5) {
                System.out.print("V");
                num=num-5;
            }else if(num>=4) {
                System.out.print("IV");
                num=num-4;
            }else if(num>=1) {
                System.out.print("I");
                num=num-1;
            }
        }
    }

}
