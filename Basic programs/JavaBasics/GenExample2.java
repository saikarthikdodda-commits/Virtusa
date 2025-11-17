package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class GenExample2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add(new String("hi"));
        list.add(new String("hello"));
        list.add(new String("how"));
        list.add(new String("are"));
        list.add(new String("you"));

        for(String s:list) {
            System.out.println(s);
        }
    }

}
