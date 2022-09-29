package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private By userNameField = By.name("user-name");
    private By passwordField = By.name("password");
    private By logInButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getUserNameField() {
        return getDriver().findElement(userNameField);
    }



    public WebElement getPasswordField() {
        return getDriver().findElement(passwordField);
    }

    public WebElement getLogInButton() {
        return getDriver().findElement(logInButton);
    }

    public void logIn(String username, String password){
        username = "standard_username";
        password = "secret_sauce";
        getUserNameField().clear();
        getUserNameField().sendKeys(username);
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
        getLogInButton().click();
    }
}
