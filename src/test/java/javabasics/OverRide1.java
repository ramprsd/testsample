package javabasics;

public class OverRide1 extends OverRide2{

    public static void main(String[] args) {

//        OverRide2 h2 = new OverRide2();
//        h2.m1();

        OverRide1 h1 = new OverRide1();
        h1.m1();

    }

    public void m1(){
        System.out.println("OverRide1");
    }

}
