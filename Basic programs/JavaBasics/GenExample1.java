package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class GenExample1 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(new Integer(12));
        list.add(new Integer(423));
        list.add(new Integer(42));
        list.add(new Integer(11));
        list.add(new Integer(89));
        list.add(new Integer(76));
        list.add(new Integer(93));
        list.add(new Integer(987));
        int sum=0;
        for(Integer ob : list) {
            System.out.println(ob );
            sum+=ob;

        }System.out.println("sum is"+sum);
    }

}
