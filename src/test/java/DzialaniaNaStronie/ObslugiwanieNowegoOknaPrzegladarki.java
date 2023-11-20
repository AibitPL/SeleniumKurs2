package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class ObslugiwanieNowegoOknaPrzegladarki {
    @Test
    public void noweOkno(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String firstWindow=driver.getWindowHandle();
        driver.findElement(By.xpath("/html/body/button[2]")).click();
        Set<String> windowNames=driver.getWindowHandles();
        for(String window:windowNames){
            if(!window.equals(firstWindow)){
                driver.switchTo().window(window);
            }
        }
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Selenium");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys(Keys.ENTER);
        driver.close();
        driver.switchTo().window(firstWindow);
        driver.findElement(By.xpath("/html/body/input")).sendKeys("Maciej");
    }
}
