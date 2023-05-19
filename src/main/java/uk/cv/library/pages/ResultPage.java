package uk.cv.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.cv.library.utility.Utility;


public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    WebElement resultText;

    public boolean verifyTheResults() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Verify the Result" + resultText.toString());
        return resultText.isDisplayed();
    }


}
