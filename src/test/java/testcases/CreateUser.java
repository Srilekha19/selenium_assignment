package testcases;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateUser {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        String ChromeDriverPath = "C:\\software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://smallpdf.com/pdf-converter");
        driver.findElement(By.xpath("//div//button[@class='sc-11drgl3-0 sc-1az4ycp-0 ireDIG kHOHNI']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srilekhachowdary19@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789@Code");
        driver.findElement(By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/form/div[3]/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='sc-11drgl3-0 sc-1az4ycp-0 ireDIG kRzaSY']")).click();
        Thread.sleep(2000);

    }
}
