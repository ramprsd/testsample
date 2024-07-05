package stepdefenitionfile;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import reusable.BaseCode;

public class Hooks {

    @Before()
    public void setup(){
        System.out.println("Browser opens...");
        BaseCode.browserInvocation();
    }

    @After()
    public void tearDown(){
        System.out.println("Browser closes...");
    }

}
