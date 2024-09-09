package Rimon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class insertBox {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://rimon.pythonanywhere.com/");
        WebElement insertbox=driver.findElement(By.xpath("//i[contains(@class, 'fa') and contains(@class, 'fa-shopping-bag') and contains(@class, 'fa-2x')]"));
        insertbox.click();
        WebElement coupon=driver.findElement(By.name("coupon"));
        coupon.sendKeys("rain10");
        WebElement submit=driver.findElement(By.xpath("//button[contains(text(), 'Apply')]"));
        submit.click();
    }
}
