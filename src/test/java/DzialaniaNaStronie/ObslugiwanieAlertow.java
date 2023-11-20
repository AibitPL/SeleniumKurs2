package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObslugiwanieAlertow {

    @Test
    public void testAlertu(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement username= driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
        WebElement password=driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
        username.clear();
        password.clear();
        username.sendKeys("Maciej");
        password.sendKeys("test");
        username.sendKeys(Keys.ENTER);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.accept();
    }
}
