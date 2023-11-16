package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WprowadzanieDanychDoInputa {

    @Test
    public void WstawDo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.findElement(By.xpath("/html/body/a[1]")).click();
        driver.findElement(By.xpath("/html/body/input")).sendKeys("Maciej");
        driver.findElement(By.xpath("/html/body/form[2]/input[1]")).clear();
        driver.findElement(By.xpath("/html/body/form[2]/input[1]")).sendKeys("Admin");

        // driver.quit();

    }
}
