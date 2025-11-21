package Java8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Map3 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("Hello","Good morning");
        map.put("Hi","How are you");
        map.put("I am good","fine");
        String user;
        String pass;
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username and password");
        user=sc.nextLine();
        pass=sc.nextLine();
        result=map.getOrDefault(user,"Password not found");
        if(result.equals(pass)){
            System.out.println("valid credentials");
        }else {
            System.out.println("invalid credentials");
        }
    }
}
