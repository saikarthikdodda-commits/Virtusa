package JavaBasics;

public class Employ2 {
    int empno;
    String name;
    Double sal;

    public Employ2() {
    }



    public Employ2(int empno, String name, double sal) {
        this.name = name;
        this.name=name;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Employ2{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
