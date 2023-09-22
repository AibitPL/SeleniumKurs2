import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCompile {
    public static void main(String[] args) {
        WebDriver Chrome=new ChromeDriver();
    }

    @Test
    public void sampleTest(){
        System.out.println("Hello");
    }
}
