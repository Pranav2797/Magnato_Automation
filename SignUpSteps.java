package SetUpDfinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObject.singupPage;
import pageObject.LoginPage;

public class SignUpSteps {
    WebDriver driver;
    singupPage signUpPage;
    LoginPage loginPage;

    @Given("I am on the Magento sign-up page")
    public void i_am_on_the_magento_sign_up_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        signUpPage = new singupPage(driver);
    }

    @When("I fill in the required fields and submit the form")
    public void i_fill_in_the_required_fields_and_submit_the_form() {
        signUpPage.enterFirstName("pranav");
        signUpPage.enterLastName("urmaliya");
        signUpPage.enterEmail("pranavurmaliya59@gmail.com");
        signUpPage.enterPassword("Ankita@2906");
        signUpPage.enterConfirmPassword("Ankita@2906");
        signUpPage.clickCreateAccount();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        // Add validation logic here
        System.out.println("Account created successfully!");
    }

    @When("I log in with the newly created account")
    public void i_log_in_with_the_newly_created_account() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("pranavurmaliya59@gmail.com");
        loginPage.enterPassword("Ankita@2906");
        loginPage.clickSignIn();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Add validation logic here
        System.out.println("Login successful!");
        driver.quit();
    }
}