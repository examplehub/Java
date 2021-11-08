package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import org.junit.jupiter.api.Test;

class FileExampleTest {

  @Test
  void testInit() {
    File file = new File("pom.xml");
    file = new File("/root/example_dir/example_file.txt");
  }

  @Test
  void testLength() {
    File file = new File("pom.xml");
    assertTrue(file.length() >= 0);
  }

  @Test
  void testLastModified() {
    File file = new File("pom.xml");
    long lastModified = file.lastModified();
    String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(lastModified));
    System.out.println(date); // 2021-08-31 09:27:21
  }

  @Test
  void testGetName() {
    File file = new File("pom.xml");
    assertEquals("pom.xml", file.getName());
  }

  @Test
  void testPath() throws IOException {
    File file = new File("../example.txt");
    assertEquals("../example.txt", file.getPath());
    // assertEquals("/Users/cswiki/Workspace/Github/examplehub/Java/../example.txt",
    // file.getAbsolutePath());
    // assertEquals("/Users/cswiki/Workspace/Github/examplehub/example.txt",
    // file.getCanonicalPath());
  }

  @Test
  void testSeparator() {
    assertEquals("/", File.separator);
  }

  @Test
  void testIsFile() {
    File file = new File("pom.xml");
    assertTrue(file.isFile());
  }

  @Test
  void testIsDirectory() {
    File file = new File("src");
    assertTrue(file.isDirectory());
  }

  @Test
  void testCreateDelete() throws IOException {
    File file = new File("demo.txt");
    assertTrue(file.createNewFile());
    assertTrue(file.delete());
  }

  @Test
  void testCreateTempFile() throws IOException {
    File tempFile = File.createTempFile("temp-", ".txt");
    tempFile.deleteOnExit();
    assertTrue(tempFile.isFile());
    assertFalse(tempFile.isDirectory());
  }

  // @Test
  void testListFiles() {
    File file = new File(".");
    for (File f : Objects.requireNonNull(file.listFiles())) {
      System.out.println(f.getName());
    }
  }

  @Test
  void testList() {
    File file = new File(".");
    for (String path : Objects.requireNonNull(file.list())) {
      System.out.println(path);
    }
  }

  @Test
  void testListWithFilter() {
    File file = new File(".");
    File[] files = file.listFiles((dir, name) -> name.endsWith(".xml"));
    assert files != null;
    assertEquals(1, files.length);
    assertEquals("pom.xml", files[0].getName());
  }

  @Test
  void testMkdir() {
    File file = new File("temp");
    assertTrue(file.mkdir());
    assertTrue(file.delete());
    assertFalse(file.exists());
  }

  @Test
  void testMkdirs() {
    File file = new File("temp/sub/1");
    assertTrue(file.mkdirs());
    assertTrue(file.delete());
    assertTrue(new File("temp/sub").delete());
    assertTrue(new File("temp").delete());
    assertFalse(file.exists());
  }

  @Test
  void testPaths() {
    Path path = Paths.get(".", "/", "pom.xml");
    assertEquals("./pom.xml", path.toString());
    System.out.println(path.toAbsolutePath());
    assertEquals("pom.xml", path.normalize().toString());
    File file = path.toFile();
    assertEquals("pom.xml", file.getName());
  }

  @Test
  void testExists() {
    File file = new File("pom.xml");
    assertTrue(file.exists());
    file = new File("pom_bk.xml");
    assertFalse(file.exists());
  }

  @Test
  void testDelete() throws IOException {
    File file = new File("pom_bk.xml");
    assertTrue(file.createNewFile());
    assertTrue(file.exists());
    assertTrue(file.delete());
    assertFalse(file.exists());
  }
}
