package Java8;

import java.util.HashMap;
import java.util.Hashtable;

public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Hello");
        map.put(2,"Good morning");
        map.put(3,"How are you");
        map.put(4,"I am good");
        map.put(5,"This is HashMap");
        System.out.println("-----HashMap-----");
        map.forEach((k,v)->{System.out.println(k+" "+v);});

        Hashtable<Integer,String> table=new Hashtable<Integer, String>();
        table.put(1,"Hello");
        table.put(2,"Good morning");
        table.put(3,"How are you");
        table.put(4,"I am good");
        table.put(5,"This is HashTable");
        System.out.println("-----HashTable-----");
        table.forEach((k,v)->{System.out.println(k+" "+v);});
    }
}
