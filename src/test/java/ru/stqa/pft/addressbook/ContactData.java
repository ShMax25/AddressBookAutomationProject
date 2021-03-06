package ru.stqa.pft.addressbook;

public class ContactData {
  private final String name;
  private final String lastName;
  private final String phone;
  private final String email;

  public ContactData (String name, String lastName, String phone, String email) {
    this.name = name;
    this.lastName = lastName;
    this.phone = phone;
    this.email = email;
  }

  public String getName () {
    return name;
  }

  public String getLastName () {
    return lastName;
  }

  public String getPhone () {
    return phone;
  }

  public String getEmail () {
    return email;
  }
}
