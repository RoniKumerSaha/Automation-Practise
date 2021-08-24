package cucumber.steps;

import automation.utils.DriverSetup;
import cucumber.api.Scenario;
import cucumber.api.java.*;

public class Hooks{

    @Before
    public void setUPDriver(){
        DriverSetup.setUpDriver();
    }

    @After
    public void closeDriver(Scenario scenario){
        if(scenario.isFailed()){
            DriverSetup.takeScreenShot(scenario);
        }
        DriverSetup.closeDriver();
    }
}
