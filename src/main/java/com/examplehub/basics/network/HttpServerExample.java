package com.examplehub.basics.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpServerExample {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(8080);
    System.out.println("server is running...");
    for (;;) {
      Socket sock = ss.accept();
      System.out.println("connected from " + sock.getRemoteSocketAddress());
      new Handler(sock).start();
    }
  }
}
class Handler extends Thread {
  Socket sock;

  public Handler(Socket sock) {
    this.sock = sock;
  }

  public void run() {
    try (InputStream input = this.sock.getInputStream()) {
      try (OutputStream output = this.sock.getOutputStream()) {
        handle(input, output);
      }
    } catch (Exception e) {
      try {
        this.sock.close();
      } catch (IOException ioe) {
      }
      System.out.println("client disconnected.");
    }
  }

  private void handle(InputStream input, OutputStream output) throws IOException {
    var reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
    var writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
    // TODO: 处理HTTP请求
    // 读取HTTP请求:
    boolean requestOk = false;
    String first = reader.readLine();
    if (first.startsWith("GET / HTTP/1.")) {
      requestOk = true;
    }
    for (;;) {
      String header = reader.readLine();
      if (header.isEmpty()) { // 读取到空行时, HTTP Header读取完毕
        break;
      }
      System.out.println(header);
    }
    System.out.println(requestOk ? "Response OK" : "Response Error");
    if (!requestOk) {
      // 发送错误响应:
      writer.write("HTTP/1.0 404 Not Found\r\n");
      writer.write("Content-Length: 0\r\n");
      writer.write("\r\n");
    } else {
      // 发送成功响应:
      String data = "<html><body><h1>Hello, world!</h1></body></html>";
      int length = data.getBytes(StandardCharsets.UTF_8).length;
      writer.write("HTTP/1.0 200 OK\r\n");
      writer.write("Connection: close\r\n");
      writer.write("Content-Type: text/html\r\n");
      writer.write("Content-Length: " + length + "\r\n");
      writer.write("\r\n"); // 空行标识Header和Body的分隔
      writer.write(data);
    }
    writer.flush();
  }
}
