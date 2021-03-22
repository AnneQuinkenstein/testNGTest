package TestNG;

import org.testng.annotations.Test;

public class day3 {

    @Test(groups ={"smoke"})
    public void Demo(){
        System.out.println("hello3");
    }

    @Test(dependsOnMethods = {"Demo"})
    public void SecondTest(){
        System.out.println("ciao3");
    }
}


