package ru.stqa.pft.addressbook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

  protected final ApplicationManager appManager = new ApplicationManager();

  @BeforeClass
  public void setup () {
    appManager.init();
  }

  @AfterClass
  public void tearDown () {
    appManager.stop();
  }

  public ApplicationManager getAppManager () {
    return appManager;
  }
}
