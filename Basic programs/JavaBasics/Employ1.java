package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class Employ1 {
    public static void main(String[] args) {


        List employ =new ArrayList<Employ>();
        employ.add(new Employ(1,"hi",20000));
        employ.add(new Employ(2,"Hello",30000));
        employ.add(new Employ(3,"how",50000));
        employ.add(new Employ(4,"are",40000));
        for(Object e:employ) {
            System.out.println(e);
        }

    }}
