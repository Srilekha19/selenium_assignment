package testcases;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class  PdfLogin{
    WebDriver driver = null;
    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] obj = {
                {"bothCorrect", "srilekhachowdary19@gmail.com", "123456789@Code"},
                {"bothWrong", "123@gmail.com", "abc"},
                {"correctUsername", "srilekha1@gmail.com", "123"},
                {"correctPassword", "abc@gmail.com", "123@code"}

        };
        return obj;
    }
    @BeforeMethod
    public void setUp() throws IOException, ParseException, org.json.simple.parser.ParseException, ParseException, FileNotFoundException {
        String chromeDriverPath = "C:\\software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        String LoginDataPath = "src/main/resources/LoginData.json";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        FileReader fr = new FileReader(LoginDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        String url = (String) jsonObject.get("url");
        System.out.println(url);
        driver.get(url);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
    @Test(dataProvider = "credentials")

    public void verifyLoginCredentials(String scenario, String email, String password) throws IOException, org.json.simple.parser.ParseException, FileNotFoundException, ParseException, InterruptedException {

        System.out.println("type=" + scenario + " " + "email= " + email + " " + "password=" + password);
        driver.findElement(By.xpath("//button[@class='sc-11drgl3-0 sc-5esrdz-1 ireDIG gCzPow']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(2000);
        String TestCases = "src/main/resources/TestCases.json";
        FileReader fr = new FileReader(TestCases);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        if (scenario.equals("bothCorrect")) {
            System.out.println("login success");

        } else if (scenario.equals("bothWrong")) {
            System.out.println("login fail");
        } else if (scenario.equals("correctUsername")) {
            System.out.println("enter correct uname");
        } else {
            System.out.println("enter correct password");
        }
    }
}

