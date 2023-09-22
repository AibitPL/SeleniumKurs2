import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WybierzPrzegladarkeZamykanie {
    @Test
    public void OpenBrowser() {
        WebDriver driver = GetDriver("Chrome");
        driver.get("https://www.google.com");
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