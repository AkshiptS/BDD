package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class dataTableSteps {

    WebDriver driver;

    @Given("user is at the login page of the application")
    public void user_is_at_the_login_page_of_the_application() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("user login with following username and password")
    public void user_login_with_following_username_and_password(DataTable dataTable) {
        List<List<String>> credentials = dataTable.asLists();

        for (List<String> row : credentials) {
            String username = row.get(0);
            String password = row.get(1);

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name")).sendKeys(username);

            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.id("login-button")).click();

            // Optionally logout for next login attempt (if needed)
            try {
                Thread.sleep(2000); // wait to observe result (optional)
                driver.get("https://www.saucedemo.com/"); // reset back to login page
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    @Then("user should be able to login with correct username and password")
    public void user_should_be_able_to_login_with_correct_username_and_password() {
        System.out.println("Login attempt completed for all users.");
        driver.quit();
    }
}
