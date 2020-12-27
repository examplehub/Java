package com.examplehub.basics;

import java.io.*;

public class SerializableExample {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    User user = new User(1, "root", "root");
    try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("user.data"))) {
      stream.writeObject(user);
    }

    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user.data"))) {
      User newUser = (User) inputStream.readObject();
      System.out.println(newUser); /* User{id=1, username='root', password='root'} */
    }
  }
}

class User implements Serializable {
  private int id;
  private String username;
  private String password;

  public User() {}

  public User(int id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{"
        + "id="
        + id
        + ", username='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + '}';
  }
}
