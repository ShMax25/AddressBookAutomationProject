package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
  private WebDriver driver;

  @BeforeClass
  public void setup () {
    System.setProperty("webriver.chrome.driver", System.getProperty("user.dir") + "src/test/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    driver.get("http://localhost/addressbook/index.php");
    login();
  }

  private void login () {
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  protected void initContactCreation () {
    driver.findElement(By.xpath("//input[@name='submit'][2]")).click();
  }

  protected void fillContactForm (ContactData contactData) {
    driver.findElement(By.name("firstname")).sendKeys(contactData.getName());
    driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    driver.findElement(By.name("home")).sendKeys(contactData.getPhone());
    driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
  }

  protected void goToContactPage () {
    driver.findElement(By.linkText("add new")).click();
  }

  protected void returnToGroupPage () {
    driver.findElement(By.linkText("group page")).click();
  }

  protected void submitGroupCreation () {
    driver.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm (GroupData groupData) {
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void initGroupCreation () {
    driver.findElement(By.name("new")).click();
  }

  protected void goToGroupPage () {
    driver.findElement(By.linkText("groups")).click();
  }

  @AfterClass
  public void tearDown () {
    driver.quit();
  }
}
