package com.java.model;

public class Employ {
    private int empno;
    private String ename;
    private Gender gender;
    private String dept;
    private String designation;
    private double salary;


    public Employ() {
    }
    public Employ(int empno, String ename, Gender gender, String dept, String designation, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.gender = gender;
        this.dept = dept;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", Gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", designation='" + designation + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }


}
