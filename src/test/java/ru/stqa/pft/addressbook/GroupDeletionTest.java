package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion () {
    appManager.goToGroupPage();
    appManager.getGroupHelper().selectGroup();
    appManager.getGroupHelper().deleteSectedGroups();
    appManager.getGroupHelper().returnToGroupPage();

  }

}
