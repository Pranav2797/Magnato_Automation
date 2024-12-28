package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(css = "button[title='Sign In']")
    WebElement signInButton;

    public void enterEmail(String email) {
        emailField.sendKeys("pranavurmaliya59@gmail.com");
    }

    public void enterPassword(String password) {
        passwordField.sendKeys("Ankita@2906");
    }

    public void clickSignIn() {
        signInButton.click();
    }
}