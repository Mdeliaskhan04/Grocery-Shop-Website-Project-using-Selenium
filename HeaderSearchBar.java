package Rimon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderSearchBar {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://rimon.pythonanywhere.com/");
        WebElement searchbar=driver.findElement(By.xpath("(//i[contains(@class, 'fa-search')])[1]"));
        searchbar.click();
        WebElement element=driver.findElement(By.name("key"));
        element.sendKeys("mango");
      WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
    }
}
