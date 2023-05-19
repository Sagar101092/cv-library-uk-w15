package uk.cv.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.cv.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement keywords;
    @FindBy(xpath = "//input[@id='location']")
    WebElement loc;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropdown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitel(String jobTitle) throws InterruptedException {
        log.info("Enter Job title" + keywords.toString());
        Thread.sleep(1000);
        sendTextToElement(keywords, jobTitle);
    }

    public void enterLocation(String location) {
        log.info("Enter Location" + loc.toString());
        sendTextToElement(loc, location);
    }

    public void selectDistance(String distance) throws InterruptedException {
        log.info("Select Distance" + distanceDropdown.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(distanceDropdown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        log.info("Click on more search options" + moreSearchOptionLink.toString());
        clickOnElement(moreSearchOptionLink);
    }

    public void enterMinSalary(String minSalary) {
        log.info("Enter Minimum salary" + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Enter Maximum salary" + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        log.info("Select salary type from dropdown" + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }

    public void selectJobType(String jobType) {
        log.info("Select job type" + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        log.info("Click on find jobs button" + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
    }

    public void accpetCookies() throws InterruptedException {
        switchToFrame("gdpr-consent-notice");
        Thread.sleep(1000);
        clickOnElement(acceptCookies);
        switchToDefaultContent();
    }

}
