package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class KlikanieNaElement {

    @Test
    public void KlikanieNa(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement StronIframe=driver.findElement(By.partialLinkText("Strona z i"));
        StronIframe.click();
        driver.navigate().back();
        WebElement Podstawowa=driver.findElement(By.xpath("/html/body/a[1]"));
        Podstawowa.click();
        driver.findElement(By.xpath("/html/body/button[2]")).click();

    }
}
