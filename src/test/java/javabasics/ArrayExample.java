package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int [] a ={1, 5, 7, 9, 6};

        for(int k:a){
            System.out.println(k);
        }

        for(int j=0;j<a.length;j++){

            System.out.println(a[j]);

        }

        String [] name = {"ram", "ram1", "ram2"};

        for(String s:name){

            System.out.println(s);

        }
    }

}
