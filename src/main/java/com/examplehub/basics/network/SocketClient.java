package com.examplehub.basics.network;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketClient {
  public static void main(String[] args) throws IOException {
    Socket clientSocket = new Socket("127.0.0.1", 6666);
    try (InputStream inputStream = clientSocket.getInputStream(); OutputStream outputStream = clientSocket.getOutputStream()) {
      handle(inputStream, outputStream);
    }
    clientSocket.close();
    System.out.println("disconnected.");
  }

  private static void handle(InputStream inputStream, OutputStream outputStream)
          throws IOException {
    var writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
    var reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    Scanner scanner = new Scanner(System.in);
    System.out.println("[server] " + reader.readLine());
    for (; ; ) {
      System.out.print(">>> ");
      String s = scanner.nextLine();
      writer.write(s + System.lineSeparator());
      writer.flush();
      String resp = reader.readLine();
      System.out.println("[server]: " + resp);
      if (resp.equals("bye")) {
        break;
      }
    }
  }
}
