package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation () {
    appManager.goToGroupPage();
    appManager.getGroupHelper().initGroupCreation();
    appManager.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    appManager.getGroupHelper().submitGroupCreation();
    appManager.getGroupHelper().returnToGroupPage();

  }
}
