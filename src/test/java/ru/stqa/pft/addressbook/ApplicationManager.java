package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  public WebDriver driver;

  private GroupHelper groupHelper;

  public void init () {
    System.setProperty("webriver.chrome.driver", System.getProperty("user.dir") + "src/test/resources/drivers/chromedriver");
   driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   groupHelper = new GroupHelper(driver);
   driver.get("http://localhost/addressbook/index.php");
    login();
  }

  public void login () {
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  public void initContactCreation () {
    driver.findElement(By.xpath("//input[@name='submit'][2]")).click();
  }

  protected void fillContactForm (ContactData contactData) {
    driver.findElement(By.name("firstname")).sendKeys(contactData.getName());
    driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    driver.findElement(By.name("home")).sendKeys(contactData.getPhone());
    driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
  }

  public void goToContactPage () {
    driver.findElement(By.linkText("add new")).click();
  }

  public void goToGroupPage () {
    driver.findElement(By.linkText("groups")).click();
  }

  public void stop () {
    driver.quit();
  }

  public GroupHelper getGroupHelper () {
    return groupHelper;
  }
}
