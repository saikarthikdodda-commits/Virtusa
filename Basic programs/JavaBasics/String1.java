package JavaBasics;

public class String1 {
    public static void main(String[] args) {
        String s="Hi";
        String str=s.concat("Hello");
        System.out.println(str);
        String str1="HI HELLO HOW ARE YOU";
        String[] str2=str1.split(" ");
        for(String str3 :str2) {
            System.out.println(str3);
        }

    }

}
