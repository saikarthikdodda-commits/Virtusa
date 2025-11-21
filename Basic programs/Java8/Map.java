package Java8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer ,String>();
        map.put(1,"Hello");
        map.put(2,"World");
        map.put(3,"Good");
        map.put(4,"Morning");
        map.put(5,"How are you");
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        key = sc.nextInt();
        String result = map.getOrDefault(key,"Not found");
        System.out.println(result);
    }
}
