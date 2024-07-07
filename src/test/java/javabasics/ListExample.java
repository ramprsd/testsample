package javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(23);
        l.add(80);

        l.add(20);
        l.add(82);

        Set<Integer> s = new HashSet<Integer>();
        s.add(4);
        s.add(1);
        s.add(1);
        s.add(20);
        s.add(21);

        for(int i:l){
            System.out.println(i);
        }
        for(int out:s){
            System.out.println(out);
        }



    }

}
