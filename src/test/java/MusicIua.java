import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MusicIua {
    public static WebDriver driver;
@Test
    public void TurnMusicOn () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");
        driver.findElement(By.name("login")).sendKeys("zaikakaterina");
        driver.findElement(By.name("pass")).sendKeys("hello_world");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"header_overall\"]/div[1]/ul[1]/li[2]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"sections\"]/div[4]/ul/li[7]/a")).click();

        driver.findElement(By.name("words")).sendKeys("Contromano");
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[2]/div/div[2]/div[3]/span/form/input[7]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div/div[5]/table/tbody/tr[2]/td[1]/a/span/i")).click();


    }
}
