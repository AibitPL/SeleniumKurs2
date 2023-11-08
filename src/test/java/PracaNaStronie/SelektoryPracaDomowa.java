package PracaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelektoryPracaDomowa {

    @Test
    public void TestGoogle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        By accept=By.cssSelector("#L2AGLb > div");
        driver.findElement(accept).click();
        By wyszukiwarka=By.cssSelector("#APjFqb");
        driver.findElement(wyszukiwarka).click();
        driver.findElement(wyszukiwarka).sendKeys("test");
        driver.findElement(wyszukiwarka).click();
        driver.findElement(wyszukiwarka).sendKeys(Keys.ENTER);
        WebElement result=driver.findElement(By.partialLinkText("Speed Test"));
        result.isDisplayed();
        driver.quit();

    }
}
