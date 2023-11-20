package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.util.List;

public class ZaznaczanieCheckBoxa {

    @Test
    public void Zaznaczanie(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("/html/body/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/form[1]/input[1]")).click();
        //driver.findElement(By.xpath("/html/body/select/option[3]")).click(); //wybor z listy danego elementu
        WebElement selectCar=driver.findElement(By.cssSelector("select"));
        Select cars=new Select(selectCar);
        cars.selectByValue("volvo");
        // Pobieranie z selecta \/
        List<WebElement> options = cars.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }
        PracaDomowa check=new PracaDomowa();
        System.out.println(check.PD1("Volvo",selectCar));
        System.out.println(check.PD1("Audie",selectCar));

    }
}
