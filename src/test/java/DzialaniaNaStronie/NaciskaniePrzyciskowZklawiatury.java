package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaciskaniePrzyciskowZklawiatury {

    @Test
    public void PrzyciskiZklawy(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement userInput=driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
        userInput.clear();
        userInput.sendKeys("Maciej");
        //userInput.sendKeys(Keys.TAB);
        userInput.sendKeys(Keys.ENTER);
    }
}
