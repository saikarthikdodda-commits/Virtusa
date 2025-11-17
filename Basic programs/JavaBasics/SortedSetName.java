package JavaBasics;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetName {
    public static void main(String[] args) {
        Comparator comp=new NameComparator();
        SortedSet<Employ> employ=new TreeSet<Employ>(comp);
        employ.add(new Employ(1,"Hi",2000));
        employ.add(new Employ(2,"Hello",2000));
        employ.add(new Employ(3,"Iam",3000));
        employ.add(new Employ(4,"A",4000));
        employ.add(new Employ(5,"Boy",5000));
        Employ[] emp;
        for(Employ e:employ) {
            System.out.println(e);
        }
    }

}
