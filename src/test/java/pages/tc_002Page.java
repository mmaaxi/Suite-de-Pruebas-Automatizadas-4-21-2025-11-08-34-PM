package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_002Page {

    private WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "usernameDisplay")
    private WebElement usernameDisplay;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isDashboardDisplayed() {
        return dashboard.isDisplayed();
    }

    public String getDisplayedUserName() {
        return usernameDisplay.getText();
    }
}