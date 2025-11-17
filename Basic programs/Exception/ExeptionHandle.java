package Exception;


import java.util.Scanner;

public class ExeptionHandle {
    public void check(String un , String em) throws UserNameException,MailException{
        String user = em.substring(0,em.indexOf("@"));
        if(un.length()<8 ||un.length()>14) {
            throw new UserNameException("must be Greater than 8 chars and lesthan than 12 chars");
        }else if(!em.contains("@")) {
            throw new MailException("email not consists @ and username");

        }else {
            System.out.println("username is : "+un);
            System.out.println("email is : " +em );
        }
    }


    public static void main(String[] args) {
        ExeptionHandle v=new ExeptionHandle();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter username ");
        String un=sc.next();
        System.out.println("enter email");
        String em=sc.next();
        try {
            v.check(un, em);
        } catch (UserNameException | MailException e) {
            System.err.println(e.getMessage());
        }

    }

}
