package Exception;

import java.util.Scanner;

public class NullPointerException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        try{
            if(name.isBlank()){
                throw new Throwable("String cannot be empty");
            }else{
                System.out.println("entered name is : " +name);
            }
        }catch(Throwable e){
            System.err.println("error: "+e.getMessage());
        }
    }
}
