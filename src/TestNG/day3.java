package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day3 {

    @Test(groups ={"smoke"})
    public void DemoFromTest3(){
        System.out.println("hello3");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"DemoFromTest3"})
    public void SecondTest(){
        System.out.println("ciao3");
    }
}


