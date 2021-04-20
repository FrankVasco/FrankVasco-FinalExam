package Espn.Tests;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name="InputDataCredentials")
    public Object[][] getCredentials(){

        Object[][] obj = new Object[1][2];

        obj [0][0] = "askim8610@gmail.com";
        obj [0][1] = "Frank861028";

        return obj;
    }

}
