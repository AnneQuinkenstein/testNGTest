package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics {

    @Parameters({"URL", "APIKey/usrname"})
    @Test
    public void Demo(String urlname, String usrname){
        System.out.println(urlname);
        System.out.println(usrname);
        System.out.println("hello");
    }

    @Test(groups ={"smoke"})
    public void SecondTest(){
        System.out.println("ciao");
    }

    @BeforeTest
    public void prerequisite() {
        System.out.println("first execution from BeforeTest to delete Data oder execute Testdata in Database. or API: Testcases, BaseURl put in Test or start mobile appium automation server");
    }

    @AfterTest
    public void lastExecution(){
        System.out.println("execute last delete Cookies, stopp processes, read reports, APIs: close connections");
    }
}


