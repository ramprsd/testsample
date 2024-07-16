package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> m= new HashMap<Integer, String>();
        m.put(123, "Ram2");
        m.put(113, "Ram1");
        m.put(133, "Ram3");
        System.out.println(m);
        System.out.println(m.get(123));
    }
}
