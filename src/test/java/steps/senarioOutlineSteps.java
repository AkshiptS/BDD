package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class senarioOutlineSteps {

    WebDriver driver;

    @Given("user is on Home Page")
    public void user_is_on_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("user navigate to login page")
    public void user_navigate_to_login_page() {
        // Already on login page in this application, so no navigation required.
        System.out.println("User is already on the login page.");
    }

    @And("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();
    }

    @Then("message displayed login successfull")
    public void message_displayed_login_successfull() {
        // You can add assertion here to verify URL, element, etc.
        System.out.println("Login steps executed successfully.");
        driver.quit();
    }
}
