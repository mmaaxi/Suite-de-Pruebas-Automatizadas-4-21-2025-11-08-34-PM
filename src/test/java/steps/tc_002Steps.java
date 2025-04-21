package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;
import utils.DriverFactory;

public class tc_002Steps {

    private WebDriver driver = DriverFactory.getDriver();
    private tc_002Page loginPage = PageFactory.initElements(driver, tc_002Page.class);

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get("https://example.com/login");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.enterUsername("validUser");
        loginPage.enterPassword("validPassword");
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        Assert.assertTrue(loginPage.isDashboardDisplayed());
    }

    @Then("the user's name should be displayed on the dashboard")
    public void the_user_s_name_should_be_displayed_on_the_dashboard() {
        Assert.assertEquals("Valid User", loginPage.getDisplayedUserName());
    }
}