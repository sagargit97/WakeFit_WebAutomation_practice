package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class Product_Search {
    public static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

    static {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);


    }

    @Given("url set to open website")
    public void url_set_to_open_website() {

        driver.get("https://www.wakefit.co/");
        driver.manage().window().maximize();

    }

    @Then("click on the search bar")
    public void click_on_the_search_bar() {
        driver.findElement(By.xpath("//div[contains(@class,'flex max-h-10')]")).click();
    }

    @And("enter {string} in search bar")
    public void enter_mattress_in_search_bar(String mattress) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Search for Mattresses, Beds, Sofas, etc']")).sendKeys("mattress");
        Thread.sleep(10000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flex max-h-[554px] w-full flex-1 cursor-pointer items-center justify-between rounded-lg rounded-b border-b border-[#f5f5f5]  bg-white p-2 text-xs font-normal leading-5 text-gray-700 transition-colors duration-300 hover:bg-purple-100 hover:text-black  sm:text-sm")));
        List<WebElement> search_results = driver.findElements(By.xpath("//div[@class='flex max-h-[554px] w-full flex-1 cursor-pointer items-center justify-between rounded-lg rounded-b border-b border-[#f5f5f5]  bg-white p-2 text-xs font-normal leading-5 text-gray-700 transition-colors duration-300 hover:bg-purple-100 hover:text-black  sm:text-sm']"));
        Random random = new Random();
        String s = search_results.get(random.nextInt(search_results.size())).getText();
        if (s.contains("mattress")) {
            search_results.get(random.nextInt(search_results.size())).click();
        } else {
            System.out.println("Related products found as suggestions");
        }

    }

    @Then("should see a list of products related to {string}")
    public void should_see_a_list_of_products_related_to(String string) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@src,'https://wakefitdev.gumlet.io/consumer-react/assets/clearicon.svg?')]")).click();

    }

    @When("no products are shown")
    public void no_products_are_shown() {

        //List<WebElement> Product_type = driver.findElements();


    }

    @Then("capture and display the error message")
    public void capture_and_display_the_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }
}


