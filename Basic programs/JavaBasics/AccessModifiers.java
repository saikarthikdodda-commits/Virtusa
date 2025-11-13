package JavaBasics;

public class AccessModifiers {
    public int  add(int a,int b) {
        return a+b;
    }
    private int sub(int a,int b) {
        return a-b;
    }
    public static void main(String[] args) {
        int a,b;
        AccessModifiers am=new AccessModifiers();
        System.out.println(am.add(10,20));
        System.out.println(am.sub(10, 20));
    }
}
