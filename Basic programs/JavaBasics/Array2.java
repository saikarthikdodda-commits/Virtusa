package JavaBasics;

public class Array2 {
    public void arr() {
        String names[]=new String[ ] {"hi" ,"hello"	};
        for(String name :names) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        Array2 a=new Array2();
        a.arr();
    }
}
