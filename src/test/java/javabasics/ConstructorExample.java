package javabasics;

public class ConstructorExample {

    static int a;
    public ConstructorExample() {
        a=1;
    }

    public static void main(String[] args) {

        ConstructorExample c = new ConstructorExample();
        c.m1();

        //m1(); - without object conrtuctor will not be invoked
    }
    public static void m1(){
        System.out.println(a);
    }

}
