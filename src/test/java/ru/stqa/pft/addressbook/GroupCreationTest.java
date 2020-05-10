package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation () {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();

  }
}
