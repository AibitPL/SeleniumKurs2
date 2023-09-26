import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WybierzPrzegladarkeZamykanie {
    @Test
    public void OpenBrowser() {
        WebDriver driver = GetDriver("Chrome");
        //driver.manage().window().maximize();
        Dimension siez = new Dimension(1200,720);
        driver.manage().window().setSize(siez);
        driver.get("https://www.google.com");
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("window.open('https://www.facebook.com','blank')");
        //driver.quit(); // zamyka wszystkie okna
        driver.close(); // zostawia ostatnie okno otware
    }

    public WebDriver GetDriver(String przegladarka){
        if(przegladarka.equals("Chrome")){
            return new ChromeDriver();
        }
        else if (przegladarka.equals("Firefox")){
            return new FirefoxDriver();
        }
        else throw new InvalidArgumentException("Invalid browser name");
    }
}