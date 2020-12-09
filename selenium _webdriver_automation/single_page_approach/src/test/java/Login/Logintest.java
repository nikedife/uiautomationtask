package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Logintest {
    private WebDriver driver ;

    @BeforeClass
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @Test
    public void printTile(){

        System.out.println(driver.getTitle());
    }
    public static void main(String args[]) throws InterruptedException{
        Logintest test = new Logintest();
        test.setUp();

    }
    @AfterClass
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();

    }


}
