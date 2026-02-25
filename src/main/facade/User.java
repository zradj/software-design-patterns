package main.facade;

import java.util.UUID;

public class User {

  private final String id;
  private final String email;

  private final String creditCardNum;

  public User() {
    this.id = UUID.randomUUID().toString();
    this.email = this.id + "@example.com";
    this.creditCardNum = "1234567890123456";
  }

  public String getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public String getCreditCardNum() {
    return creditCardNum;
  }
}
