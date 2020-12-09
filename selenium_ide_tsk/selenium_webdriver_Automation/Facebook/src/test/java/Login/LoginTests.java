package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver ;

    @BeforeClass
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/Resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/login/?next");
        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("nnamdi_jil@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("Pasc@ll@w");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();



    }

    public static void main(String args[]) throws InterruptedException{
        LoginTests test = new LoginTests();
        test.setUp();

    }
    @AfterClass
    public void tearDown(){
        driver.quit();

    }


}
