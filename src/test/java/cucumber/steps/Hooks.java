package cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.DriverSetup;

public class Hooks{

    @Before
    public void setUPDriver(){
        System.out.println("Before");
        DriverSetup.setUpDriver();
    }

    @After
    public void closeDriver(){
        System.out.println("After");
        DriverSetup.closeDriver();
    }
}