package JavaBasics;

public class Employ {

    int empno;
    String name;
    double sal;

    public Employ() {

    }
    public Employ(int empno, String name, double sal) {
        this.empno=empno;
        this.name=name;
        this.sal=sal;
    }


    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + sal +
                '}';

    }

}
