package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PobieranieWartosciZinputa {
    @Test
    public void Pobieranko(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement usernameInput=driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
        usernameInput.clear();
        usernameInput.sendKeys("Maciej");
        System.out.println(usernameInput.getAttribute("value")); //pobieranie wartosci z wpisanego inputa na stronie
        //pobieranie z ukrytego paragrafu \/
        WebElement ukryty=driver.findElement(By.xpath("/html/body/p"));
        System.out.println(ukryty.getAttribute("textContent")); //wypisanie tekstu z ukrytego paragrafu na stronie

    }
}
