package uk.cv.library;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.cv.library.propertyreader.PropertyReader;
import uk.cv.library.utility.Utility;

import java.io.IOException;

public class Hooks extends Utility {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShortPath = Utility.getScreenshot(driver, scenario.getName().replace("", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShortPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }

}
