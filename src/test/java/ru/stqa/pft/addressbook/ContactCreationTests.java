package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation () {
    goToContactPage();
    fillContactForm(new ContactData("Name", "Lname", "24592", "email@mail.com"));
    initContactCreation();
  }
}
