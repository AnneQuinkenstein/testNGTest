package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {

    @Test
    public void Demo(){
        System.out.println("hello2");
    }

    @Test(dataProvider = "getData")
    public void SecondTest(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];

        //1st set
        data[0][0] = "firstusername";
        data[0][1] = "password";

        //2nd set
        data[1][0] = "secondusername";
        data[1][1] = "password";

        //3rd set
        data[2][0] = "thirdusername";
        data[2][1] = "password";
        return data;
    }
}


