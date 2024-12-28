package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class singupPage {
    WebDriver driver;

    public singupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "password-confirmation")
    WebElement confirmPassword;

    @FindBy(css = "button[title='Create an Account']")
    WebElement createAccountButton;

    public void enterFirstName(String fName) {
        firstName.sendKeys("pranav");
    }

    public void enterLastName(String lName) {
        lastName.sendKeys("urmaliya");
    }

    public void enterEmail(String emailAddress) {
        email.sendKeys("pranavurmaliya59@gmail.com");
    }

    public void enterPassword(String pwd) {
        password.sendKeys("Ankita@gmail.com");
    }

    public void enterConfirmPassword(String confirmPwd) {
        confirmPassword.sendKeys("Ankita@gmail.com");
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}