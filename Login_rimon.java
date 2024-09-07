import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Login_rimon {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://rimon.pythonanywhere.com/login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement username=driver.findElement(By.name("username"));
        username.isDisplayed();
        if(username.isDisplayed()){
            username.clear();
            username.sendKeys("Elias");
        }
        else {
            System.out.println("Username field has not found");
        }
        WebElement password=driver.findElement(By.name("password"));
        password.isDisplayed();
        if(password.isDisplayed())
        {
            password.clear();
            password.sendKeys("elias1234");
        }
        else{
            System.out.println("Password field has not found");
        }
        WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
        button.isDisplayed();
        if(button.isDisplayed()){
            button.click();
        }
        else{
            System.out.println("Button have not found!!");
        }
        String actualPageTitle=driver.getTitle();
        System.out.println(actualPageTitle);

        String expectedPageTitle="Grocery Shop";
        System.out.println(expectedPageTitle);

       if(actualPageTitle.contentEquals(expectedPageTitle))
       {
           System.out.println("Passed");
       }
       else {
           System.out.println("failed");
       }

        Thread.sleep(5000);
        WebElement home=driver.findElement(By.linkText("Home"));
        home.click();
        Thread.sleep(5000);
        WebElement shop=driver.findElement(By.linkText("Shop"));
        shop.click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Fruits")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Vegetables")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Home")).click();
        driver.navigate().refresh();

    }
}
