import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PierwszyTest {

    @Test
    public void ChromeTest() {
        WebDriver driver = GetDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // driver.switchTo().frame(0); // przepinamy sie do pierwszego okienka (pliki cookie)
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        agreeButton.click();
        //driver.switchTo().defaultContent();
        WebElement search = driver.findElement(By.name("q")); // przechodzimy do pola wyszukiwania google
        search.sendKeys("Selenium"); // wpisujemy selenium
        search.sendKeys(Keys.ENTER); // klikanie enter
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));
        Assert.assertTrue(result.isDisplayed());

    }

    public WebDriver GetDriver(String browser) {
        switch (browser) {
            case "Chrome":
                return new ChromeDriver();
            case "Firefox":
                return new FirefoxDriver();
            default:
                throw new InvalidArgumentException("Zla nazwa przegladarki");
        }
    }
}