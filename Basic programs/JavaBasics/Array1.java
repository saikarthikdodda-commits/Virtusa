package JavaBasics;

public class Array1 {
    public void arr() {
        int a[]=new int[] {10,20,30	};
        for(int i :a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Array1 a=new Array1();
        a.arr();
    }
}
