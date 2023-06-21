package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {
    WebDriver driver=null;
    public Sample(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickLogin1()
    {
        String loc="//button[@class='sc-11drgl3-0 sc-5esrdz-1 ireDIG gCzPow']";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();

    }

    public void setEmail(String value)
    {
        String loc="//input[@type='email']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }

    public void setPassword(String value)
    {
        String loc="//input[@type='password']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }
    public void clickLogin2()
    {
        String loc="//*[@id='app']/div[2]/div[2]/div[2]/div[2]/form/div[3]/button";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void clickIcon1()
    {
        String loc= "//div[@class='vnoyvz-2 gWujyV']";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void clickAccount(){
        String loc="//a[@class='lqkt1b-0 hTbYid sc-10jm8oj-0 eGwGrI']";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }


//    public void clickIcon2(){
//        String loc="//*[@id='app']/div/div[2]/div/div/div[1]/div/button";
//        WebElement e=this.driver.findElement(By.xpath(loc));
//        e.click();
//    }

    public void clickProfile()
    {
        String loc="//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div/div[2]/a/button";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void clearFname(){
        String loc="//input[@class='sc-1wunvx4-0 iwgDOj']";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.clear();
    }
//    public void clickProfile(){
//        String loc="//input[@class='sc-1wunvx4-0 iwgDOj']";
//        WebElement e=this.driver.findElement(By.xpath(loc));
//        e.click();
//    }

    public void setFname(String value){
        String loc="//input[@class='sc-1wunvx4-0 iwgDOj']";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.sendKeys(value);
    }

    public void click_saveChanges(){
        String loc="//button[@class='__Fy_76 __xPr1O __vQZ6m __fURgB __yqivR __V2i14 __qjmK0 __M1rrq __hgzBT __i_0Qr']";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void clickDocuments(){
        String loc = "//a[@href='/#s=documents']";
        WebElement e = this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void clickIcon2(){
        String loc="//*[@id=\"app\"]/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[4]/button";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void clickDelete(){
        String loc="//*[@id=\"app\"]/div/div[1]/div/div[2]/div[3]/div[2]/div[2]/div/button[6]";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }
    public void clickYes(){
        String loc="//*[@id=\"app\"]/div/div[1]/div/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/button";
        WebElement e=this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void clickSearch(){
        String loc = "//a[@href='/#s=search']";
        WebElement e = this.driver.findElement(By.xpath(loc));
        e.click();
    }

    public void setSearch(String value){
        String loc="//input[@class='fqo3yf-3 kZoSTZ']";
        WebElement e= this.driver.findElement(By.xpath(loc));
        e.sendKeys(value);
    }
}
