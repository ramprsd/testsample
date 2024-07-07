package javabasics;

public class OverLoadPolymorhism {

    public static void main(String[] args) {

        OverLoadPolymorhism overLoad = new OverLoadPolymorhism();

        overLoad.m1(1, 2);
        overLoad.m1(1);
        overLoad.m1("Ram");

    }

    public void m1(int a){
        System.out.println(a);
    }

    public void m1(int c, int b){
        System.out.println(c+b);
    }

    public void m1(String s){
        System.out.println(s);

    }


}
