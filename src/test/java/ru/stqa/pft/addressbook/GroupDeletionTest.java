package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TesBase {

  @Test
  public void testGroupDeletion () {
    goToGroupPage();
    selectGroup();
    deleteSectedGroups();
    returnToGroupPage();

  }

}
