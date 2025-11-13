package JavaBasics;

public class Array3 {
    public void arr() {
        int a[]= {1,2,3,4,5	};
        int b[]=a;
        for(int i : b) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Array3 a=new Array3();
        a.arr();
    }
}
