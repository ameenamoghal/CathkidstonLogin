package Com.QA.CathKidson;

import static org.junit.Assert.assertTrue;

import Com.QA.CathKidson.Drivers.DriverFactory;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Test;


public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
public void startUp() throws InterruptedException {
    driverFactory.Browser("Firefox");
    driverFactory.setUpUrl("https://www.cathkidston.com/");
    driverFactory.maximiseWindow();
//    driverFactory.handlePopWindow();
    driverFactory.timeOut();

  //  @After
  //  driverFactory.closeBrowser();
}




    }

