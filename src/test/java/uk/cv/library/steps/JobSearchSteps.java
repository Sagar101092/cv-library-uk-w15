package uk.cv.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.cv.library.pages.HomePage;
import uk.cv.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("^I am on homePage$")
    public void iAmOnHomePage() {
    }

    @When("^I accept cookies$")
    public void iAcceptCookies() throws InterruptedException {
        new HomePage().accpetCookies();
    }

    @And("^I enter Job Title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) throws InterruptedException {
        new HomePage().enterJobTitel(jobTitle);
    }

    @And("^I Enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("^I select Distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) throws InterruptedException {
        new HomePage().selectDistance(distance);

    }

    @And("^I click On more Search Option Link$")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter Min Salary \"([^\"]*)\"$")
    public void iEnterMinSalary(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("^I enter Max Salary \"([^\"]*)\"$")
    public void iEnterMaxSalary(String salaryMax) {
       new HomePage().enterMaxSalary(salaryMax);
    }

    @And("^I select salary Type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType) {
       new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select Job Type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("^I click On find Job Button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }
    @Then("^Verify the \"([^\"]*)\"$")
    public void verifyThe(String result) throws Throwable {
        Assert.assertTrue(new ResultPage().verifyTheResults());
    }
}
