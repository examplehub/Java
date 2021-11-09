package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class User implements Serializable{
  @Serial
  private static final long serialVersionUID = 100L;
  private final String username;
  private final String password;
  private final int age;

  public User(String username, String password, int age) {
    this.username = username;
    this.password = password;
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
            "username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            '}';
  }
}
class ObjectOutputInputStreamExampleTest {
  @Test
  void testWriteRead() throws IOException, ClassNotFoundException {

    User user = new User("root", "112233", 25);
    String filename = "user.db";
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
      oos.writeObject(user);
    }
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
      User readUser = (User) ois.readObject();
      assertEquals(user.toString(), readUser.toString());
    }
    assertTrue(Files.deleteIfExists(Paths.get(filename)));
  }
}