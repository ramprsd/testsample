package javabasics;

public class KeyWordExample extends ArrayExample{

    int a =2;
    final double pi = 3.14;
    public static void main(String[] args) {
        KeyWordExample k  = new KeyWordExample();
        k.m1();
    }

    public void m1(){
        int a =5;
        //pi = 80;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(pi);
    }
}
