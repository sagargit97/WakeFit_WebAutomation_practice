package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


public class Product_Search {
    public static WebDriver  driver;

    static {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);


    }

    @Given("given url for the website")
    public void given_url_for_the_website() {

        driver.get("https://www.wakefit.co/");
        driver.manage().window().maximize();

    }
    @Then("navigate to search bar")
    public void navigate_to_search_bar() {
       driver.findElement(By.xpath("//div[contains(@class,'flex max-h-10')]")).click();
    }
    @And("enter the product name as {string}")
    public void enter_the_product_name_as(String mattress) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Search for Mattresses, Beds, Sofas, etc']")).sendKeys("mattress");
        System.out.println("Related products found as suggestions");
    }
    @Then("should see a list of products related to {string} then clear the search bar")
    public void should_see_a_list_of_products_related_to_then_clear_the_search_bar(String string)throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@src,'https://wakefitdev.gumlet.io/consumer-react/assets/clearicon.svg?')]")).click();

    }
    @And("again navigate to search bar enter {string}")
    public void again_navigate_to_search_bar_enter (String string) throws InterruptedException {

        List<WebElement> Product_type = driver.findElements();


            Thread.sleep(2000);
            //WebElement errorMsg = driver.findElement(By.xpath("//element[contains(text(),'No Products Found')]"));
            WebElement element = driver.findElement(By.xpath("//element[contains(text(),'No Products Found')]"));
            String errorText = element.getText();
            System.out.println("Error text: " + errorText);
        }
    }


