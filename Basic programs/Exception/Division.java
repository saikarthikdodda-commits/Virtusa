package Exception;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        int b=sc.nextInt();
        try{
            if(b==0){
                throw new  Exception("b value cannot be zero");
            }else{
                float c=a/b;
                System.out.println("a/b is: "+c);
            }
        }catch( Exception e){
            System.err.println("check that : "+e.getMessage());
        }

        }
    }

