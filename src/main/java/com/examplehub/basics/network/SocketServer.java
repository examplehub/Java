package com.examplehub.basics.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketServer {
  static class ServerHandler implements Runnable {
    private Socket socket;

    public ServerHandler(Socket socket) {
      this.socket = socket;
    }
    public void run() {
      try (InputStream inputStream = this.socket.getInputStream()) {
        try(OutputStream outputStream = this.socket.getOutputStream()) {
          handle(inputStream, outputStream);
        }
      } catch (Exception e) {
        try {
          this.socket.close();
        } catch (IOException ex) {
        }
        System.out.println("client disconnect");
      }
    }

    private void handle(InputStream inputStream, OutputStream outputStream) throws IOException {
      var reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
      var writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
      writer.write("hello!\n");
      writer.flush();
      while (true) {
        String line = reader.readLine();
        if (line.equals("bye")) {
          writer.write("bye\n");
          writer.flush();
          break;
        }
        writer.write("ok: " + line + "\n");
        writer.flush();
      }
    }
  }

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(6666);
    System.out.println("server is started!");
    while (true) {
      Socket socket = serverSocket.accept();
      System.out.println("connected from " + socket.getRemoteSocketAddress());
      new Thread(new ServerHandler(socket)).start();
    }
    //TODO
  }
}
