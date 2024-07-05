package javabasics;

public class ConditionsExample {

    public static void main(String[] args) {

        int a=10;
        int b=56;
        int [] c = {1, 2, 3};

        for(int i=0; i<c.length;i++){
            System.out.println(c[i]);
        }

        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("Greater");

        }
        else{
            System.out.println("Lesser");
        }

    }
}
