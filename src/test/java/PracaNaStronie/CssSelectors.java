package PracaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    @Test
    public void FindElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By cssID=By.cssSelector("#clickOnMe");
        driver.findElement(cssID);

        By cssClass=By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        By cssTagName=By.cssSelector("input");
        driver.findElement(cssTagName).sendKeys("Maciej");

        By cssName=By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        By cssClass2=By.cssSelector("[class='topSecret']"); //inny sposob zapisu wyszukiwania klas
        driver.findElement(cssClass2);


    }
}
