package Exception;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter array size");

         try{
             int size=sc.nextInt();
             if(size>arr.length){
                 throw new ArrayIndexOutOfBoundsException("Array size given is too large than actual array size");
             }else if(size==arr.length){
                 System.out.println("both arrays are equal in size :"+arr.length);
             }
             else{
                 System.out.println("Actual array size is : "+arr[size]);
             }
         }catch(ArrayIndexOutOfBoundsException e){
             System.err.println("error: "+e.getMessage());
         }


    }
}
